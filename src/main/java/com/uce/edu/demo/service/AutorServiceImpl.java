package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IAutorRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Autor;

@Service
public class AutorServiceImpl implements IAutorService {

	@Autowired
	private IAutorRepository autorRepository;
	
	@Override
	public void insertar(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepository.insertar(autor);
	}

	@Override
	public int actualizar(String nombre, Integer edad) {
		// TODO Auto-generated method stub
		return this.autorRepository.actualizar(nombre, edad);
	}

	@Override
	public Autor buscar(String codigoAutor) {
		// TODO Auto-generated method stub
		return this.autorRepository.buscar(codigoAutor);
	}

	@Override
	public int eliminar(String codigoAutor) {
		// TODO Auto-generated method stub
		return this.autorRepository.eliminar(codigoAutor);
	}

}
