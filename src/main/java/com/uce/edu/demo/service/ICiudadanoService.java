package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.onetoone.Ciudadano;

public interface ICiudadanoService {

	public void insertarCiudadano(Ciudadano ciudadano);

	public Ciudadano buscar(Integer id);

	public void actualizar(Ciudadano ciudadano);

	public void eliminar(Integer id);
}
