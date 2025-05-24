package edu.com.unpaz.service;

public class LongitudMinima extends Reglas{
	
	private int longitud;
	public LongitudMinima(int longitud) {
		super("Longitud minima", "la cantidad de caracteres de la contraseña debe ser de almenos " + longitud);
		this.longitud = longitud;
	}

	@Override
	public boolean validar(String pass) {
		return pass.length() >= this.longitud;
	}
}
