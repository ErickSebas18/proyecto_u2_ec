package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPersonaJdbcRepository;
import com.uce.edu.demo.to.Persona;

@Service
public class PersonaJdbcServiceImpl implements IPersonaJdbcService{

	@Autowired
	private IPersonaJdbcRepository personaJdbcRepository;
	
	@Override
	public void guardarPersona(Persona persona) {
		// TODO Auto-generated method stub
		this.personaJdbcRepository.insertar(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.personaJdbcRepository.actualizar(persona);
	}

	@Override
	public void eliminarPersona(int id) {
		// TODO Auto-generated method stub
		this.personaJdbcRepository.eliminar(id);
	}

	@Override
	public Persona buscarPersonaId(int id) {
		// TODO Auto-generated method stub
		return this.personaJdbcRepository.buscarId(id);
	}

}
