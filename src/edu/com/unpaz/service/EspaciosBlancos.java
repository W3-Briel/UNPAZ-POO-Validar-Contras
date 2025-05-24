package edu.com.unpaz.service;

public class EspaciosBlancos extends Reglas{

	public EspaciosBlancos() {
		super("Espacios vacios", "La contraseña no puede tener espacios vacios");
	}

	@Override
	public boolean validar(String pass) {
		return !pass.contains(" ");
	}
	
}
