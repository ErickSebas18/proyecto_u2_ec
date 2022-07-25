package com.uce.edu.demo.repository.modelo.onetomany;

import java.time.LocalDateTime;

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
@Table(name = "libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "libr_seq_id")
	@SequenceGenerator(name = "libr_seq_id", sequenceName = "libr_seq_id", allocationSize = 1)
	@Column(name = "libr_id")
	private Integer id;
	@Column(name = "libr_codigo_libro")
	private String codigoLibro;
	@Column(name = "libr_fecha_edicion")
	private LocalDateTime fechaEdicion;
	@Column(name = "libr_nombre_editorial")
	private String nombreEditorial;
	@Column(name = "libr_genero_libro")
	private String generoLibro;

	@ManyToOne
	@JoinColumn(name = "libr_id_autor")
	private Autor autor;

	// SET Y GET

	public String getCodigoLibro() {
		return codigoLibro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCodigoLibro(String codigoLibro) {
		this.codigoLibro = codigoLibro;
	}

	public LocalDateTime getFechaEdicion() {
		return fechaEdicion;
	}

	public void setFechaEdicion(LocalDateTime fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}

	public String getNombreEditorial() {
		return nombreEditorial;
	}

	public void setNombreEditorial(String nombreEditorial) {
		this.nombreEditorial = nombreEditorial;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getGeneroLibro() {
		return generoLibro;
	}

	public void setGeneroLibro(String generoLibro) {
		this.generoLibro = generoLibro;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", codigoLibro=" + codigoLibro + ", fechaEdicion=" + fechaEdicion
				+ ", nombreEditorial=" + nombreEditorial + ", generoLibro=" + generoLibro + "]";
	}

}
