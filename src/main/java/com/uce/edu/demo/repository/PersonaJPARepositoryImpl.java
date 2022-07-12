package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Persona;

@Repository
@Transactional
public class PersonaJPARepositoryImpl implements IPersonaJPARepository {

	// interactuar con mi base de datos
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Persona buscarId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Persona.class, id);
	}

	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.persist(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.merge(persona);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarId(id));
	}

	@Override
	public Persona buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("Select p from Persona p where p.cedula = :cedula");
		jpqlQuery.setParameter("cedula", cedula);
		return (Persona) jpqlQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaTyped(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> typedQuery = this.entityManager
				.createQuery("Select p from Persona p where p.cedula = :cedula", Persona.class);
		typedQuery.setParameter("cedula", cedula);
		return typedQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaNamed(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedula");
		jpqlQuery.setParameter("cedula", cedula);
		return (Persona) jpqlQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaTypedNamed(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> typedQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedula", Persona.class);
		typedQuery.setParameter("cedula", cedula);
		return typedQuery.getSingleResult();
	}

	@Override
	public List<Persona> buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("Select p from Persona p where p.apellido = :apellido");
		jpqlQuery.setParameter("apellido", apellido);
		return jpqlQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPorNombreApellido(String nombre, String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> typedQuery = this.entityManager.createNamedQuery("Persona.buscarPorNombreApellido", Persona.class);
		typedQuery.setParameter("nombre", nombre);
		typedQuery.setParameter("apellido", apellido);
		return typedQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("Select p from Persona p where p.genero = :genero");
		jpqlQuery.setParameter("genero", genero);
		return jpqlQuery.getResultList();
	}

	@Override
	public List<Persona> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("Select p from Persona p where p.nombre = :nombre");
		jpqlQuery.setParameter("nombre", nombre);
		return jpqlQuery.getResultList();
	}

	@Override
	public int actualizarPorApellido(String apellido, String genero) {
		// TODO Auto-generated method stub
		// Query jpqlQuery = this.entityManager.createQuery();
		Query jpqlQuery = this.entityManager
				.createQuery("Update Persona p set p.genero = :genero where p.apellido = :apellido");
		jpqlQuery.setParameter("genero", genero);
		jpqlQuery.setParameter("apellido", apellido);
		return jpqlQuery.executeUpdate();
	}

	@Override
	public int borrarPorGenero(String genero) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("Delete from Persona p where p.genero = :genero");
		jpqlQuery.setParameter("genero", genero);
		return jpqlQuery.executeUpdate();
	}

}
