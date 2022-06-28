package com.uce.edu.demo.service;

import com.uce.edu.demo.to.Estudiante;

public interface IEstudianteService {

	public void insertarEstudiante(Estudiante estudiante);

	public Estudiante buscarEstudianteId(int id);

	public void actualizarEstudiante(Estudiante estudiante);

	public void eliminarEstudiante(int id);

}
