package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;

public interface IPersonaJPAService {

	public Persona buscarId(Integer id);

	public void insertar(Persona persona);

	public void actualizar(Persona persona);

	public void eliminar(Integer id);

	public Persona buscarPorCedula(String cedula);
	
	public Persona buscarPorCedulaTyped(String cedula);
	
	public Persona buscarPorCedulaNamed(String cedula);
	
	public Persona buscarPorCedulaTypedNamed(String cedula);
	
	public Persona buscarPorCedulaNative(String cedula);
	
	public Persona buscarPorCedulaNamedNative(String cedula);
	
	public Persona buscarPorCedulaCriteriaApi(String cedula);
	
	public Persona buscarDinamicamente(String nombre, String apellido, String genero);
	
	public List<Persona> buscarPorApellido(String apellido);
	
	public List<Persona> buscarPorNombreApellido(String nombre, String apellido);

	public List<Persona> buscarPorGenero(String genero);

	public List<Persona> buscarPorNombre(String nombre);

	public int actualizarPorApellido(String apellido, String genero);
	
	public int borrarPorGenero(String genero);
	
	public List<PersonaSencilla> buscarPorApellidoPersonaSencilla(String apellido);
	
	public List<PersonaContadorGenero> contarPersonasGenero();
	
}
