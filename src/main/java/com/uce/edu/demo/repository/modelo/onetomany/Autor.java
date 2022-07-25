package com.uce.edu.demo.repository.modelo.onetomany;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autor_seq_id")
	@SequenceGenerator(name = "autor_seq_id", sequenceName = "autor_seq_id", allocationSize = 1)
	@Column(name = "autor_id")
	private Integer id;
	@Column(name = "autor_nombre")
	private String nombre;
	@Column(name = "autor_fecha_Nacimiento")
	private LocalDateTime fechaNacimiento;
	@Column(name = "autor_edad")
	private Integer edad;
	@Column(name = "autor_codigo")
	private String codigoAutor;
	@OneToMany(mappedBy = "autor")
	private List<Libro> libros;

	// SET Y GET

	public String getNombre() {
		return nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCodigoAutor() {
		return codigoAutor;
	}

	public void setCodigoAutor(String codigoAutor) {
		this.codigoAutor = codigoAutor;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad
				+ "]";
	}

}
