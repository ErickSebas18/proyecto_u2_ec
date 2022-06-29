package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Persona;

public interface IPersonaJPAService {

	public Persona buscarId(Integer id);
	
	public void insertar(Persona persona);
	
	public void actualizar(Persona persona);
	
	public void eliminar(Integer id);
 
	
}
