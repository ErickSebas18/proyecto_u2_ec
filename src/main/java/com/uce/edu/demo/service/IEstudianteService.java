package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Estudiante;

public interface IEstudianteService {

	public void insertarEstudiante(Estudiante estudiante);

	public Estudiante buscarEstudiante(Integer id);

	public void actualizarEstudiante(Estudiante estudiante);

	public void eliminarEstudiante(Integer id);
}
