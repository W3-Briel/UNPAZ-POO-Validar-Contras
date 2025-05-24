package edu.com.unpaz.service;

public class CaracterEspecial extends Reglas{
	private String especiales;
	
	public CaracterEspecial(String especiales) {
		super("Caracter especial", "la contraseña deberia contener almenos un caracter especial" + ": " + especiales);
		this.especiales = especiales;
	}

	@Override
	public boolean validar(String pass) {
		for (String caracter : pass.split("")) {
			if (this.especiales.contains(caracter)) return true;
		}
		return false;
	}

}
