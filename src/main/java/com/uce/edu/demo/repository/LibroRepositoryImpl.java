package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.onetomany.Libro;

@Repository
@Transactional
public class LibroRepositoryImpl implements ILibroRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
	}

	@Override
	public void actualizar(String codigoLibro, String nombreEditorial) {
		// TODO Auto-generated method stub
		TypedQuery<Libro> query = this.entityManager.createQuery(
				"Update Libro l set l.nombreEditorial = :nombreEditorial where l.codigoLibro = :codigoLibro",
				Libro.class);
		query.setParameter("nombreEditorial", nombreEditorial);
		query.setParameter("codigoLibro", codigoLibro);
		query.executeUpdate();
	}

	@Override
	public List<Libro> buscar(String genero) {
		// TODO Auto-generated method stub
		TypedQuery<Libro> query = this.entityManager.createQuery("Select l from Libro l where l.genero = :genero",
				Libro.class);
		query.setParameter("genero", genero);
		return query.getResultList();
	}

	@Override
	public void eliminar(String codigoLibro) {
		// TODO Auto-generated method stub
		TypedQuery<Libro> query = this.entityManager
				.createQuery("Delete l from Libro l where l.codigoLibro = codigoLibro", Libro.class);
		query.setParameter("codigoLibro", codigoLibro);
		query.executeUpdate();

	}

}
