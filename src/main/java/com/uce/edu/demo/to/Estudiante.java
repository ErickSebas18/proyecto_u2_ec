package com.uce.edu.demo.to;

public class Estudiante {

	private int id;
	private String nombre;
	private String apellido;
	private String facultad;
	private String carrera;

	public Estudiante() {
		// TODO Auto-generated constructor stub
	}
	
	public Estudiante(int id, String nombre, String apellido, String facultad, String carrera) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.facultad = facultad;
		this.carrera = carrera;
	}

	// SET Y GET
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", facultad=" + facultad
				+ ", carrera=" + carrera + "]";
	}

}
