package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;

public interface IPersonaJPARepository {

	public Persona buscarId(Integer id);
	
	public void insertar(Persona persona);
	
	public void actualizar(Persona persona);
	
	public void eliminar(Integer id);
 
	public Persona buscarPorCedula(String cedula);
	
	public List<Persona> buscarPorApellido(String apellido);
	
	public List<Persona> buscarPorGenero(String genero);
	
	public List<Persona> buscarPorNombre(String nombre);
	
	public int actualizarPorApellido(String apellido, String genero);
	
	public int borrarPorGenero(String genero);
}
