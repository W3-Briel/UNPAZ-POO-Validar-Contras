package edu.com.unpaz.service;

public class LongitudMaxima extends Reglas{
	private int longitud;
	
	public LongitudMaxima(int longitud) {
		super("Longitud maxima", "la contraseña no puede tener mas de: " + longitud + " caracteres");
		this.longitud = longitud;
	}

	@Override
	public boolean validar(String pass) {
		return pass.length() <= this.longitud;
	}
}
