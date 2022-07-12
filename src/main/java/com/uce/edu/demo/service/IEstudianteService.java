package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Estudiante;

public interface IEstudianteService {

	public void insertarEstudiante(Estudiante estudiante);

	public Estudiante buscarEstudiante(Integer id);

	public void actualizarEstudiante(Estudiante estudiante);

	public void eliminarEstudiante(Integer id);

	public Estudiante buscarPorNumeroMatriculaQuery(String numeroMatricula);

	public int actualizarFacultadCarreraQuery(String facultad, String carrera, Integer id);

	public List<Estudiante> buscarPorGeneroEstadoCivilTyped(String genero, String estadoCivil);

	public Estudiante buscarPorNumeroMatriculaNombreApellidoTyped(String numeroMatricula, String nombre, String apellido);

	public List<Estudiante> buscarEstudiantePorFacultadOCarreraNamed(String facultad, String carrera);

	public List<Estudiante> buscarporNombreEstadoCivilTypedNamed(String nombre, String estadoCivil);
}
