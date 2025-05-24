package edu.com.unpaz.service;

public class AlgunNumero extends Reglas{

	public AlgunNumero() {
		super("Algun numero", "la contraseña deberia contener almenos un numero");
	}

	@Override
	public boolean validar(String pass) {
		for (String caracter : pass.split("")) {
			if ("0123456789".contains(caracter)) return true;
		}

		return false;
	}

}
