package com.uce.edu.demo.repository.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.uce.edu.demo.repository.modelo.onetoone.Ciudadano;

@Entity
@Table(name = "pasaporte")
public class Pasaporte {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pasa_seq_id")
	@SequenceGenerator(name = "pasa_seq_id", sequenceName = "pasa_seq_id", allocationSize = 1)
	@Column(name = "pasa_id")
	private Integer id;
	@Column(name = "pasa_numero")
	private String numero;
	@Column(name = "pasa_fechaEmision")
	private LocalDateTime fechaEmision;
	@Column(name = "pasa_fechaCaducidad")
	private LocalDateTime fechaCaducidad;
	@OneToOne
	@JoinColumn(name = "pasa_id_ciudadano")
	private Ciudadano ciudadano;

	// SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public LocalDateTime getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public Ciudadano getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}

	@Override
	public String toString() {
		return "Pasaporte [id=" + id + ", numero=" + numero + ", fechaEmision=" + fechaEmision + ", fechaCaducidad="
				+ fechaCaducidad + "]";
	}

}
