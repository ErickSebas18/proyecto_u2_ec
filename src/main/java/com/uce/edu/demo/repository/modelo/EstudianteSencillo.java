package com.uce.edu.demo.repository.modelo;

public class EstudianteSencillo {

	private String numeroMatricula;
	private String nombre;
	private String apellido;
	private String carrera;

	public EstudianteSencillo() {
		// TODO Auto-generated constructor stub
	}

	public EstudianteSencillo(String numeroMatricula, String nombre, String apellido, String carrera) {
		this.numeroMatricula = numeroMatricula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "EstudianteSencillo [numeroMatricula=" + numeroMatricula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", carrera=" + carrera + "]";
	}

	// SET Y GET
	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}
