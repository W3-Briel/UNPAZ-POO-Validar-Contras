package edu.com.unpaz.service;

public abstract class Reglas {
	private String nombre;
	private String mensaje;
	
	public Reglas (String nombre, String mensaje) {
		this.nombre = nombre;
		this.mensaje = mensaje;
	}
	
	public abstract boolean validar(String pass);
	
	public String getNombre(){
		return this.nombre;
	}
	public String getMensaje() {
		return this.mensaje;
	}
}