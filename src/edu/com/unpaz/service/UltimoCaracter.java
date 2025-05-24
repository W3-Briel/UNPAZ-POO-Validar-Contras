package edu.com.unpaz.service;

public class UltimoCaracter extends Reglas{

	private String caracteres;
	public UltimoCaracter(String caracteres) {
		super("Ultimo caracter", "El ultimo caracter de la contraseña no puede ser alguno de los siguientes: " + caracteres);
		this.caracteres = caracteres;
	}

	@Override
	public boolean validar(String pass) {
		char ultimoCaracter = pass.charAt(pass.length() -1);
		return !(this.caracteres.contains(String.valueOf(ultimoCaracter)));
	}
}
