package com.uce.edu.demo.repository.modelo;

public class EstudianteFacultadGenero {

	private String facultad;
	private Long contador;
	private String estadoCivil;
	private String carrera;

	public EstudianteFacultadGenero() {
		// TODO Auto-generated constructor stub
	}

	public EstudianteFacultadGenero(String facultad, String carrera, String estadoCivil, Long contador) {
		this.facultad = facultad;
		this.carrera = carrera;
		this.estadoCivil = estadoCivil;
		this.contador = contador;
	}

	// SET Y GET
	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public Long getContador() {
		return contador;
	}

	public void setContador(Long contador) {
		this.contador = contador;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "EstudianteFacultadGenero [facultad=" + facultad + ", contador=" + contador + ", estadoCivil=" + estadoCivil
				+ ", carrera=" + carrera + "]";
	}

}
