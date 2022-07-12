package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Estudiante;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.merge(estudiante);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

	@Override
	public Estudiante buscarPorNumeroMatriculaQuery(String numeroMatricula) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("Select e from Estudiante e where e.numeroMatricula=:numeroMatricula");
		jpqlQuery.setParameter("numeroMatricula", numeroMatricula);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public int actualizarFacultadCarreraQuery(String facultad, String carrera, Integer id) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager
				.createQuery("Update Estudiante e set e.facultad = :facultad, e.carrera = :carrera where e.id = :id");
		jpqlQuery.setParameter("facultad", facultad);
		jpqlQuery.setParameter("carrera", carrera);
		jpqlQuery.setParameter("id", id);
		return jpqlQuery.executeUpdate();
	}

	@Override
	public List<Estudiante> buscarPorGeneroEstadoCivilTyped(String genero, String estadoCivil) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> typedQuery = this.entityManager.createQuery(
				"Select e from Estudiante e where e.genero = :genero and e.estadoCivil = :estadoCivil",
				Estudiante.class);
		typedQuery.setParameter("genero", genero);
		typedQuery.setParameter("estadoCivil", estadoCivil);
		return typedQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorNumeroMatriculaNombreApellidoTyped(String numeroMatricula, String nombre, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> typedQuery = this.entityManager.createQuery(
				"Select e from Estudiante e where e.numeroMatricula = :numeroMatricula and e.nombre = :nombre and e.apellido = :apellido order by e.apellido",
				Estudiante.class);
		typedQuery.setParameter("numeroMatricula", numeroMatricula);
		typedQuery.setParameter("nombre", nombre);
		typedQuery.setParameter("apellido", apellido);
		return typedQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarEstudiantePorFacultadOCarreraNamed(String facultad, String carrera) {
		// TODO Auto-generated method stub
		Query namedQuery = this.entityManager.createNamedQuery("Estudiante.buscarEstudiantePorFacultadCarreraNamed");
		namedQuery.setParameter("facultad", facultad);
		namedQuery.setParameter("carrera", carrera);
		return namedQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarporNombreEstadoCivilTypedNamed(String nombre, String estadoCivil) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> typedNamedQuery = this.entityManager
				.createNamedQuery("Estudiante.buscarporNombreEstadoCivilTypedNamed", Estudiante.class);
		typedNamedQuery.setParameter("nombre", nombre);
		typedNamedQuery.setParameter("estadoCivil", estadoCivil);
		return typedNamedQuery.getResultList();
	}

}
