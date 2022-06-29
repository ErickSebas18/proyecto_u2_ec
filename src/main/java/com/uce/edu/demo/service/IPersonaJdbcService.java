package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.to.PersonaTo;

public interface IPersonaJdbcService {

	public void guardarPersona(PersonaTo persona);
	
	public void actualizar(PersonaTo persona);
	
	public void eliminarPersona(int id);
	
	public PersonaTo buscarPersonaId(int id);
	
	public List<PersonaTo> buscarTodos();
	
}
