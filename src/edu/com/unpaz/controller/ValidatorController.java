package edu.com.unpaz.controller;

import edu.com.unpaz.service.IValidator;

public class ValidatorController {
	private IValidator validador;
	
	public ValidatorController(IValidator validador) {
		this.validador = validador;
	}
	
	public void usuariosValidos() {
		System.out.println("=== VALIDOS ===");
		validador.getUsuariosValidos().forEach(System.out::println);
		System.out.println("=== === === ===");
	}
	
	public void usuariosNoValidos() {
		System.out.println("=== NOVALIDOS ===");
		validador.getUsuariosNoValidos()
				.entrySet()
				.stream()
				.forEach(entry -> {
					System.out.println("-----------");
					System.out.println(entry.getKey());
					
					entry.getValue().forEach(r -> {
						System.out.println("\t"+r.getNombre() +" : "+r.getMensaje());
					});
					System.out.println("-----------");
				});
		System.out.println("=== === === ===");
	}
	
}
