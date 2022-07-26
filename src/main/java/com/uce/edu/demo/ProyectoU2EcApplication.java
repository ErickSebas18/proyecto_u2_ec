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
import com.uce.edu.demo.repository.modelo.tarea24.Autor2;
import com.uce.edu.demo.repository.modelo.tarea24.Libro2;
import com.uce.edu.demo.repository.modelo.tarea24.Libro2_Autor2;
import com.uce.edu.demo.service.IAutor2Service;
import com.uce.edu.demo.service.IAutorService;
import com.uce.edu.demo.service.ILibro2Autor2Service;
import com.uce.edu.demo.service.ILibro2Service;
import com.uce.edu.demo.service.ILibroService;

@SpringBootApplication
public class ProyectoU2EcApplication implements CommandLineRunner {

	private static Logger logJava = Logger.getLogger(ProyectoU2EcApplication.class);

	@Autowired
	private ILibro2Service libro2Service;

	@Autowired
	private IAutor2Service autor2Service;

	@Autowired
	private ILibro2Autor2Service libro2Autor2Service;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		logJava.info("INSERTANDO UN LIBRO CON DOS AUTORES");

//		Libro2 libro2 = new Libro2();
//		libro2.setTitulo("Juanito en la Guerra");
//		libro2.setCantidadPaginas(65);
//		
//		this.libro2Service.insertarLibro2(libro2);
//		
//		Autor2 autor2 = new Autor2();
//		autor2.setNombre("Christian Moya");
//		
//		Autor2 autor3 = new Autor2();
//		autor3.setNombre("Christian Moya");
//		
//		this.autor2Service.insertarAutor2(autor2);
//		this.autor2Service.insertarAutor2(autor3);

//		Libro2 libro2 = new Libro2();
//		libro2.setId(1);
//
//		Autor2 autor2 = new Autor2();
//		autor2.setId(1);
//
//		Autor2 autor3 = new Autor2();
//		autor3.setId(2);
//
//		Libro2_Autor2 liau = new Libro2_Autor2();
//		liau.setLibro_id(libro2);
//		liau.setAutor_id(autor2);
//
//		Libro2_Autor2 liau2 = new Libro2_Autor2();
//		liau2.setLibro_id(libro2);
//		liau2.setAutor_id(autor3);
//
//		this.libro2Autor2Service.insertarLibro2Autor2(liau);
//		this.libro2Autor2Service.insertarLibro2Autor2(liau2);

		logJava.info("INSERTANDO UN AUTOR CON DOS LIBROS");

//		Libro2 libro2 = new Libro2();
//		libro2.setTitulo("Juanito en la Guerra");
//		libro2.setCantidadPaginas(65);
//		
//		Libro2 libro3 = new Libro2();
//		libro3.setTitulo("XMLSMS");
//		libro3.setCantidadPaginas(78);
//		
//		this.libro2Service.insertarLibro2(libro2);
//		this.libro2Service.insertarLibro2(libro3);
//		
//		Autor2 autor2 = new Autor2();
//		autor2.setNombre("Erick Chávez");
//		
//		this.autor2Service.insertarAutor2(autor2);
		

		Libro2 libro2 = new Libro2();
		libro2.setId(2);
		
		Libro2 libro3 = new Libro2();
		libro3.setId(3);

		Autor2 autor2 = new Autor2();
		autor2.setId(3);
		
		Libro2_Autor2 liau = new Libro2_Autor2();
		liau.setLibro_id(libro2);
		liau.setAutor_id(autor2);

		Libro2_Autor2 liau2 = new Libro2_Autor2();
		liau2.setLibro_id(libro3);
		liau2.setAutor_id(autor2);

		this.libro2Autor2Service.insertarLibro2Autor2(liau);
		this.libro2Autor2Service.insertarLibro2Autor2(liau2);
	}

}
