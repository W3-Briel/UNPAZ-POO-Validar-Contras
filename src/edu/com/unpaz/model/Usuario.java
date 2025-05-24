package edu.com.unpaz.model;

public class Usuario {
	private String nombreApellido;
	private String correo;
	private String pass;
	
	
	public Usuario(String nombreApellido, String correo, String pass) {
		this.nombreApellido = nombreApellido;
		this.correo = correo;
		this.pass = pass;
	}
	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	public String toString() {
		return String.format("nombreApellido: %s, correo: %s", this.nombreApellido,this.correo);
	}
}
