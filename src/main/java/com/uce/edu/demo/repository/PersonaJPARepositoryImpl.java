package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
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
	public Persona buscarPorCedulaNative(String cedula) {
		// TODO Auto-generated method stub
		Query nativeQuery = this.entityManager.createNativeQuery("Select * from persona where pers_cedula = :cedula",
				Persona.class);
		nativeQuery.setParameter("cedula", cedula);
		return (Persona) nativeQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaNamedNative(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Persona> namedNativeQuery = this.entityManager.createNamedQuery("Persona.buscarPorCedulaNamedNative",
				Persona.class);
		namedNativeQuery.setParameter("cedula", cedula);
		return namedNativeQuery.getSingleResult();
	}

	@Override
	public Persona buscarPorCedulaCriteriaApi(String cedula) {
		// TODO Auto-generated method stub
		// Creamos una isntancia de la interfaz Criteria Builder fábrica para construir
		// mi SQL
		CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();
		// Especificamos el retorno de mi SQL
		CriteriaQuery<Persona> criteriaQuery = criteriaBuilder.createQuery(Persona.class);
		// Aqui empezamos a construir el SQL
		Root<Persona> personaRoot = criteriaQuery.from(Persona.class);
		// creiteriaQuery.select(personaRoot) // Select p from Persona p
		// Las condiciones where en criteriaAPI se los conoce como predicados
		TypedQuery<Persona> queryFinal = this.entityManager.createQuery(
				criteriaQuery.select(personaRoot).where(criteriaBuilder.equal(personaRoot.get("cedula"), cedula)));
		return queryFinal.getSingleResult();
	}

	@Override
	public Persona buscarDinamicamente(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Persona> criteriaQuery = myCriteria.createQuery(Persona.class);
		Root<Persona> myTable = criteriaQuery.from(Persona.class);
		Predicate predicateNombre = myCriteria.equal(myTable.get("nombre"), nombre);
		Predicate predicateApellido = myCriteria.equal(myTable.get("apellido"), apellido);
		Predicate predicateFinal = null;
		if (genero.equals("F")) {
			predicateFinal = myCriteria.and(predicateNombre, predicateApellido);
		} else {
			predicateFinal = myCriteria.or(predicateNombre, predicateApellido);
		}
		
		TypedQuery<Persona> queryFinal = this.entityManager.createQuery(criteriaQuery.select(myTable).where(predicateFinal));
		return queryFinal.getSingleResult();
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
		TypedQuery<Persona> typedQuery = this.entityManager.createNamedQuery("Persona.buscarPorNombreApellido",
				Persona.class);
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

	@Override
	public Persona buscarDinamicamentePredicados(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Persona> criteriaQuery = myCriteria.createQuery(Persona.class);
		Root<Persona> myTable = criteriaQuery.from(Persona.class);
		Predicate predicateNombre = myCriteria.equal(myTable.get("nombre"), nombre);
		Predicate predicateApellido = myCriteria.equal(myTable.get("apellido"), apellido);
		Predicate predicateGenero = myCriteria.equal(myTable.get("genero"), genero);
		Predicate predicateFinal = null;
		if (genero.equals("F")) {
			predicateFinal = myCriteria.or(predicateNombre, predicateApellido);
			predicateFinal = myCriteria.and(predicateFinal, predicateGenero);
		} else {
			predicateFinal = myCriteria.and(predicateNombre, predicateApellido);
			predicateFinal = myCriteria.or(predicateNombre, predicateApellido);
		}
		
		TypedQuery<Persona> queryFinal = this.entityManager.createQuery(criteriaQuery.select(myTable).where(predicateFinal));
		return queryFinal.getSingleResult();
	}

}
