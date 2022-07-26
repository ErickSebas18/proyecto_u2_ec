package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IAutor2Repository;
import com.uce.edu.demo.repository.modelo.tarea24.Autor2;

@Service
public class Autor2ServiceImpl implements IAutor2Service {

	@Autowired
	private IAutor2Repository iAutor2Repository;
	
	@Override
	public void insertarAutor2(Autor2 autor2) {
		// TODO Auto-generated method stub
		this.iAutor2Repository.insertar(autor2);
	}

}
