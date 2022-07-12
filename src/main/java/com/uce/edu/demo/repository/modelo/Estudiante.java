package com.uce.edu.demo.repository.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@NamedQuery(name = "Estudiante.buscarEstudiantePorFacultadCarreraNamed", query = "Select e from Estudiante e where e.facultad = :facultad or e.carrera = :carrera order by e.carrera")
@NamedQuery(name = "Estudiante.buscarporNombreEstadoCivilTypedNamed", query = "Select e from Estudiante e where e.nombre = :nombre or e.estadoCivil = :estadoCivil")
@Entity
@Table(name = "estudianteU")
public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estu_seq_id")
	@SequenceGenerator(name = "estu_seq_id", sequenceName = "estu_seq_id", allocationSize = 1)
	@Column(name = "estu_id")
	private Integer id;
	@Column(name = "estu_nombre")
	private String nombre;
	@Column(name = "estu_apellido")
	private String apellido;
	@Column(name = "estu_facultad")
	private String facultad;
	@Column(name = "estu_carrera")
	private String carrera;
	@Column(name = "estu_num_Matricula")
	private String numeroMatricula;
	@Column(name = "estu_genero")
	private String genero;
	@Column(name = "estu_estado_civil")
	private String estadoCivil;

	// SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", facultad=" + facultad
				+ ", carrera=" + carrera + ", numeroMatricula=" + numeroMatricula + ", genero=" + genero
				+ ", estadoCivil=" + estadoCivil + "]";
	}

}
