package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.onetomany.Libro;

public interface ILibroService {

	public void insertar(Libro libro);

	public void actualizar(String codigoLibro, String nombreEditorial);

	public List<Libro> buscar(String genero);

	public void eliminar(String codigoLibro);
}
