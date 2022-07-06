package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPersonaJPARepository;
import com.uce.edu.demo.repository.modelo.Persona;

@Service
public class PersonaJPAServiceImpl implements IPersonaJPAService {

	@Autowired
	private IPersonaJPARepository personaJPARepository;
	
	@Override
	public Persona buscarId(Integer id) {
		// TODO Auto-generated method stub
		return this.personaJPARepository.buscarId(id);
	}

	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		this.personaJPARepository.insertar(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.personaJPARepository.actualizar(persona);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.personaJPARepository.eliminar(id);
	}

	@Override
	public Persona buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.personaJPARepository.buscarPorCedula(cedula);
	}

	@Override
	public List<Persona> buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.personaJPARepository.buscarPorApellido(apellido);
	}

}
