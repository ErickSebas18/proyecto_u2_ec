package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.manytomany.Autor;

public interface IAutorRepository {

	public void insertar(Autor autor);
	
	public int actualizar(String nombre, Integer edad);
	
	public Autor buscar(String codigoAutor);
	
	public int eliminar(String codigoAutor);
	
}
