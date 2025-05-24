package edu.com.unpaz.service;

import java.util.List;
import java.util.Map;

import edu.com.unpaz.model.Usuario;

public interface IValidator {
	List<Usuario> getUsuariosValidos();
	Map<Usuario,List<Reglas>> getUsuariosNoValidos();
}
