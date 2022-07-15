package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IEstudianteRepository;
import com.uce.edu.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepository estudianteRepository;
	
	@Override
	public void insertarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.insertar(estudiante);
	}

	@Override
	public Estudiante buscarEstudiante(Integer id) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscar(id);
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepository.actualizar(estudiante);
	}

	@Override
	public void eliminarEstudiante(Integer id) {
		// TODO Auto-generated method stub
		this.estudianteRepository.eliminar(id);
	}

	@Override
	public Estudiante buscarPorNumeroMatriculaQuery(String numeroMatricula) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarPorNumeroMatriculaQuery(numeroMatricula);
	}

	@Override
	public int actualizarFacultadCarreraQuery(String facultad, String carrera, Integer id) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.actualizarFacultadCarreraQuery(facultad, carrera, id);
	}

	@Override
	public List<Estudiante> buscarPorGeneroEstadoCivilTyped(String genero, String estadoCivil) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarPorGeneroEstadoCivilTyped(genero, estadoCivil);
	}

	@Override
	public Estudiante buscarPorNumeroMatriculaNombreApellidoTyped(String numeroMatricula, String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarPorNumeroMatriculaNombreApellidoTyped(numeroMatricula, nombre, apellido);
	}

	@Override
	public List<Estudiante> buscarEstudiantePorFacultadOCarreraNamed(String facultad, String carrera) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarEstudiantePorFacultadOCarreraNamed(facultad, carrera);
	}

	@Override
	public List<Estudiante> buscarporNombreEstadoCivilTypedNamed(String nombre, String estadoCivil){
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarporNombreEstadoCivilTypedNamed(nombre, estadoCivil);
	}

	@Override
	public List<Estudiante> buscarPorNombreApellidoNative(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarPorNombreApellidoNative(nombre, apellido);
	}

	@Override
	public Estudiante buscarPorNumeroMatriculaNative(String numeroMatricula) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarPorNumeroMatriculaNative(numeroMatricula);
	}

	@Override
	public List<Estudiante> buscarPorCarreraNamedNative(String carrera) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarPorCarreraNamedNative(carrera);
	}

	@Override
	public List<Estudiante> buscarPorEstadoCivilOGeneroNamedNative(String estadoCivil, String genero) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarPorEstadoCivilOGeneroNamedNative(estadoCivil, genero);
	}

}
