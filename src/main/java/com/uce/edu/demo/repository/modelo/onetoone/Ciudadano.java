package com.uce.edu.demo.repository.modelo.onetoone;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.uce.edu.demo.repository.modelo.Pasaporte;

@Entity
@Table(name = "Ciudadano")
public class Ciudadano {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ciud_seq_id")
	@SequenceGenerator(name = "ciud_seq_id", sequenceName = "ciud_seq_id", allocationSize = 1)
	@Column(name = "ciud_id")
	private Integer id;
	@Column(name = "ciud_nombre")
	private String nombre;
	@Column(name = "ciud_apellido")
	private String apellido;
	@Column(name = "ciud_cedula")
	private String cedula;
	@Column(name = "ciud_fecha_Nacimiento")
	private LocalDateTime fechaNacimiento;
//	@OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL)
//	private Empleado empleado;
	@OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL)
	private Pasaporte pasaporte;
	
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
	
//	public Empleado getEmpleado() {
//		return empleado;
//	}
//
//	public void setEmpleado(Empleado empleado) {
//		this.empleado = empleado;
//	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Pasaporte getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}

	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", fechaNacimiento=" + fechaNacimiento + ", pasaporte=" + pasaporte + "]";
	}
	
}
