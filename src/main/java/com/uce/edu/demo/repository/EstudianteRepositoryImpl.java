package com.uce.edu.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.to.Estudiante;

@Repository
public class EstudianteRepositoryImpl implements IEstudianteRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("insert into estudiante(id, nombre, apellido, facultad, carrera) values (?,?,?,?,?)",
				new Object[] { estudiante.getId(), estudiante.getNombre(), estudiante.getApellido(),
						estudiante.getFacultad(), estudiante.getCarrera() });
	}

	@Override
	public Estudiante buscar(int id) {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.queryForObject(
				"select * from estudiante where id=?", new Object[] { id },
				new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("update estudiante set facultad=?, carrera=? where id=?",
				new Object[] { estudiante.getFacultad(), estudiante.getCarrera(), estudiante.getId() });
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		this.jdbcTemplate.update("delete from estudiante where id=?", new Object[] { id });
	}

}
