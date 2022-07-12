package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {

	public void insertar(Estudiante estudiante);
	
	public Estudiante buscar(Integer id);
	
	public void actualizar(Estudiante estudiante);
	
	public void eliminar(Integer id);
	
	public Estudiante buscarPorNumeroMatriculaQuery(String numeroMatricula);
	
	public int actualizarFacultadCarreraQuery(String facultad, String carrera, Integer id);
	
	public List<Estudiante> buscarPorGeneroEstadoCivilTyped(String genero, String estadoCivil);
	
	public Estudiante buscarPorNumeroMatriculaNombreApellidoTyped(String numeroMatricula, String nombre, String apellido);
	
	public List<Estudiante> buscarEstudiantePorFacultadOCarreraNamed(String facultad, String carrera);
	
	public List<Estudiante> buscarporNombreEstadoCivilTypedNamed(String nombre, String estadoCivil);
	
}
