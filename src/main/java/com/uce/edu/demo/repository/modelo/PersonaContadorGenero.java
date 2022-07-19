package com.uce.edu.demo.repository.modelo;

public class PersonaContadorGenero {

	private String genero;

	private Long contador;
	
	public PersonaContadorGenero() {
		// TODO Auto-generated constructor stub
	}

	public PersonaContadorGenero(String genero, Long contador) {
		// TODO Auto-generated constructor stub
		this.genero = genero;
		this.contador = contador;
	}

	// SET Y GET
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Long getContador() {
		return contador;
	}

	public void setContador(Long contador) {
		this.contador = contador;
	}

	@Override
	public String toString() {
		return "PersonaContadorGenero [genero=" + genero + ", contador=" + contador + "]";
	}

	
}
