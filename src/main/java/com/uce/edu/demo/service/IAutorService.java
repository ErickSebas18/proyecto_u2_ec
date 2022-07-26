package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.manytomany.Autor;

public interface IAutorService {

	public void insertar(Autor autor);

	public int actualizar(String nombre, Integer edad);

	public Autor buscar(String codigoAutor);

	public int eliminar(String codigoAutor);
}
