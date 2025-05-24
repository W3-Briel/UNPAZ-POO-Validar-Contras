package edu.com.unpaz.main;

import edu.com.unpaz.controller.ValidatorController;
import edu.com.unpaz.repo.LeerUsuariosRepo;
import edu.com.unpaz.service.AlgunNumero;
import edu.com.unpaz.service.CaracterEspecial;
import edu.com.unpaz.service.EspaciosBlancos;
import edu.com.unpaz.service.LongitudMaxima;
import edu.com.unpaz.service.LongitudMinima;
import edu.com.unpaz.service.UltimoCaracter;
import edu.com.unpaz.service.ValidatorServ;

public class app {
	
	public static void main (String[] args) {
		//repo
		LeerUsuariosRepo userData = new LeerUsuariosRepo();
		
		//serv
		ValidatorServ validar = new ValidatorServ(userData,
				new AlgunNumero(),
				new CaracterEspecial("!#$%&="),
				new EspaciosBlancos(),
				new LongitudMaxima(12),
				new LongitudMinima(8),
				new UltimoCaracter("!#$%&=")
				);
		
		//controller
		ValidatorController mostrar = new ValidatorController(validar);
		
		mostrar.usuariosNoValidos();
		mostrar.usuariosValidos();
	}
}