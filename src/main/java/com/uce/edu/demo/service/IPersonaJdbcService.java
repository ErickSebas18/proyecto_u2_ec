package com.uce.edu.demo.service;

import com.uce.edu.demo.to.Persona;

public interface IPersonaJdbcService {

	public void guardarPersona(Persona persona);
	
	public void actualizar(Persona persona);
	
	public void eliminarPersona(int id);
	
	public Persona buscarPersonaId(int id);
}
