package com.uce.edu.demo.repository.modelo.manytomany;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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

	@ManyToMany(mappedBy = "autores")
	private Set<Libro> libros;

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

	public Set<Libro> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + "]";
	}

}
