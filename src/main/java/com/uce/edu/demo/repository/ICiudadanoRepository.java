package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Ciudadano;

public interface ICiudadanoRepository {

	public void insertarCiudadano(Ciudadano ciudadano);
	
	public Ciudadano buscar(Integer id);
	
	public void actualizar(Ciudadano ciudadano);
	
	public void eliminar(Integer id);
}
