package edu.com.unpaz.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import edu.com.unpaz.model.Usuario;
import edu.com.unpaz.repo.ILeerUsuarios;

public class ValidatorServ implements IValidator{
	
	ILeerUsuarios data;
	List<Reglas> reglas;
	
	public ValidatorServ(ILeerUsuarios usrRepo, Reglas... reglas) {
		this.data = usrRepo;
		this.reglas = Arrays.asList(reglas);
	}
	
	public List<Usuario> getUsuariosValidos(){
		List<Usuario> usuarios = data.leerUsuarios();
		
		return usuarios.stream()
					.filter(usr -> {
						String pass = usr.getPass();
						return reglas.stream().allMatch(r -> r.validar(pass));
					})
					.collect(Collectors.toList());
	}
	
	public Map<Usuario,List<Reglas>> getUsuariosNoValidos(){
		List<Usuario> usuarios = data.leerUsuarios();
		
		Map<Usuario,List<Reglas>> noValidos = new HashMap<Usuario,List<Reglas>>();
	
		usuarios.stream()
				.forEach(usr -> {
					String pass = usr.getPass();
					List<Reglas> breakRules = this.reglas.stream()
													.filter(r -> !r.validar(pass))
													.collect(Collectors.toList());
					if ( !breakRules.isEmpty() ) {
						noValidos.put(usr, breakRules);
					}
				});
		
		return noValidos;
	}
}