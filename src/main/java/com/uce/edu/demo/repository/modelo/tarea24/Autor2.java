package com.uce.edu.demo.repository.modelo.tarea24;

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
@Table(name = "autor2")
public class Autor2 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autor2_seq_id")
	@SequenceGenerator(name = "autor2_seq_id", sequenceName = "autor2_seq_id", allocationSize = 1)
	@Column(name = "autor2_id")
	private Integer id;
	@Column(name = "autor2_nombre")
	private String nombre;
	@OneToMany(mappedBy = "autor")
	private List<Libro2_Autor2> libro2_autor2;
	
	
	//SET Y GET
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
	
	public List<Libro2_Autor2> getLibro2_autor2() {
		return libro2_autor2;
	}
	public void setLibro2_autor2(List<Libro2_Autor2> libro2_autor2) {
		this.libro2_autor2 = libro2_autor2;
	}
	@Override
	public String toString() {
		return "Autor2 [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
