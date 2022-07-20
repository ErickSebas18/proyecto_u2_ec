package com.uce.edu.demo.repository.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Empleado")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empl_seq_id")
	@SequenceGenerator(name = "empl_seq_id", sequenceName = "empl_seq_id", allocationSize = 1)
	@Column(name = "empl_id")
	private Integer id;
	@Column(name = "empl_codigo_iess")
	private String codigoIess;
	@Column(name = "empl_salario")
	private BigDecimal salario;
	@OneToOne
	@JoinColumn(name = "empl_id_ciudadano")
	private Ciudadano ciudadano;

	// SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoIess() {
		return codigoIess;
	}

	public void setCodigoIess(String codigoIess) {
		this.codigoIess = codigoIess;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	
	public Ciudadano getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", codigoIess=" + codigoIess + ", salario=" + salario + "]";
	}

}
