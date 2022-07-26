package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.manytomany.Autor;

@Repository
@Transactional
public class AutorRepositoryImpl implements IAutorRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Autor autor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(autor);
	}

	@Override
	public int actualizar(String nombre, Integer edad) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("Update Autor a set a.edad = :edad where a.nombre=:nombre");
		jpqlQuery.setParameter("edad", edad);
		jpqlQuery.setParameter("nombre", nombre);
		return jpqlQuery.executeUpdate();
	}

	@Override
	public Autor buscar(String codigoAutor) {
		// TODO Auto-generated method stub
		TypedQuery<Autor> query = this.entityManager
				.createQuery("Select a from Autor a where a.codigoAutor = :codigoAutor", Autor.class);
		query.setParameter("codigoAutor", codigoAutor);
		return query.getSingleResult();
	}

	@Override
	public int eliminar(String codigoAutor) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("Delete from Autor a where a.codigoAutor = :codigoAutor");
		jpqlQuery.setParameter("codigoAutor", codigoAutor);
		return jpqlQuery.executeUpdate();
	}

}
