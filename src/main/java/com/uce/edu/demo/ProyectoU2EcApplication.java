package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.onetomany.Autor;
import com.uce.edu.demo.repository.modelo.onetomany.Libro;
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

		Autor autor = new Autor();
		autor.setNombre("Gerardo");
		autor.setEdad(60);
		autor.setFechaNacimiento(LocalDateTime.now());
		autor.setCodigoAutor("7894");

		// this.autorService.insertar(autor);
		logJava.info("Se ha insertado un autor" + autor);

		logJava.info("Buscar un autor" + this.autorService.buscar("86241"));

		logJava.info("Se ha actualizado el autor: " + this.autorService.actualizar("Alfredo", 55));

		logJava.info("Se ha eliminado el autor: " + this.autorService.eliminar("62314"));

	}

}
