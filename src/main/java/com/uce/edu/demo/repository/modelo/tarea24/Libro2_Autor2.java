package com.uce.edu.demo.repository.modelo.tarea24;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "libro2_autor2")
public class Libro2_Autor2 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lia2_seq_id")
	@SequenceGenerator(name = "lia2_seq_id", sequenceName = "lia2_seq_id", allocationSize = 1)
	@Column(name = "lia2_id")
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "libro_id")
	private Libro2 libro;
	@ManyToOne
	@JoinColumn(name = "autor_id")
	private Autor2 autor;
	
	//SET Y GET
	public Libro2 getLibro() {
		return libro;
	}
	public void setLibro_id(Libro2 libro) {
		this.libro = libro;
	}
	public Autor2 getAutor_id() {
		return autor;
	}
	public void setAutor_id(Autor2 autor) {
		this.autor = autor;
	}
	
}
