package com.uce.edu.demo;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.manytomany.Autor;
import com.uce.edu.demo.repository.modelo.manytomany.Libro;
import com.uce.edu.demo.service.IAutorService;
import com.uce.edu.demo.service.ILibroService;

@SpringBootApplication
public class ProyectoU2EcApplication implements CommandLineRunner {

	private static Logger logJava = Logger.getLogger(ProyectoU2EcApplication.class);

	@Autowired
	private IAutorService autorService;

	@Autowired
	private ILibroService libroService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Libro libro = new Libro();
		libro.setTitulo("JPA");
		libro.setCantidadPaginas(2000);
		
		Autor autor = new Autor();
		autor.setNombre("Maria Hernandez");
		
		Set<Autor> autores = new HashSet<>();
		autores.add(autor);

		libro.setAutores(autores);
		
		this.libroService.insertar(libro);
	}

}
