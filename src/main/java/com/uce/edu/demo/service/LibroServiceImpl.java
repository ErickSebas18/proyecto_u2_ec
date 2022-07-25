package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ILibroRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Libro;

@Service
public class LibroServiceImpl implements ILibroService {

	@Autowired
	private ILibroRepository iLibroRepository;
	
	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		this.iLibroRepository.insertar(libro);
	}

	@Override
	public void actualizar(String codigoLibro, String nombreEditorial) {
		// TODO Auto-generated method stub
		this.iLibroRepository.actualizar(codigoLibro, nombreEditorial);
	}

	@Override
	public List<Libro> buscar(String genero) {
		// TODO Auto-generated method stub
		return this.iLibroRepository.buscar(genero);
	}

	@Override
	public void eliminar(String codigoLibro) {
		// TODO Auto-generated method stub
		this.iLibroRepository.eliminar(codigoLibro);
	}

}
