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
@Table(name = "libro2")
public class Libro2 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libr2_seq_id")
	@SequenceGenerator(name = "libr2_seq_id", sequenceName = "libr2_seq_id", allocationSize = 1)
	@Column(name = "libr2_id")
	private Integer id;
	@Column(name = "libr2_titulo")
	private String titulo;
	@Column(name = "libr2_cantidad_paginas")
	private Integer cantidadPaginas;
	@OneToMany(mappedBy = "libro")
	private List<Libro2_Autor2> libro2_autor2;
	
	//SET Y GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getCantidadPaginas() {
		return cantidadPaginas;
	}
	public void setCantidadPaginas(Integer cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}
	public List<Libro2_Autor2> getLibro2_autor2() {
		return libro2_autor2;
	}
	public void setLibro2_autor2(List<Libro2_Autor2> libro2_autor2) {
		this.libro2_autor2 = libro2_autor2;
	}
	@Override
	public String toString() {
		return "Libro2 [id=" + id + ", titulo=" + titulo + ", cantidadPaginas=" + cantidadPaginas + "]";
	}

}
