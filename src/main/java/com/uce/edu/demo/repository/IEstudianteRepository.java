package com.uce.edu.demo.repository;

import com.uce.edu.demo.to.Estudiante;

public interface IEstudianteRepository {

	public void insertar(Estudiante estudiante);
	
	public Estudiante buscar(int id);
	
	public void actualizar(Estudiante estudiante);
	
	public void eliminar(int id);
}
