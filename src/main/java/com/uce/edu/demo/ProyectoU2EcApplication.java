package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.to.Estudiante;

@SpringBootApplication
public class ProyectoU2EcApplication implements CommandLineRunner{
	
	private static Logger logJava = Logger.getLogger(ProyectoU2EcApplication.class);
	
	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//INSERTAR ESTUDIANTES
		Estudiante estudiante = new Estudiante();
		estudiante.setId(1);
		estudiante.setNombre("Andrés");
		estudiante.setApellido("Carrera");
		estudiante.setFacultad("Facultad de Quimica");
		estudiante.setCarrera("Ingeniería Quimica");
		
		//this.estudianteService.insertarEstudiante(estudiante);
		logJava.info("Se ha insertado un nuevo estudiante: " + estudiante);
		
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setId(5);
		estudiante1.setNombre("Cristian");
		estudiante1.setApellido("Travez");
		estudiante1.setFacultad("Facultad de Ciencias");
		estudiante1.setCarrera("Biología");
		
		//this.estudianteService.insertarEstudiante(estudiante1);
		logJava.info("Se ha insertado un nuevo estudiante: " + estudiante1);
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setId(12);
		estudiante2.setNombre("Ana");
		estudiante2.setApellido("Guevara");
		estudiante2.setFacultad("Facultad de Filosofía");
		estudiante2.setCarrera("Educación");
		
		//this.estudianteService.insertarEstudiante(estudiante2);
		logJava.info("Se ha insertado un nuevo estudiante: " + estudiante2);
		
		//BUSCAR ESTUDIANTES
		logJava.info("El estudiante buscado es: " + this.estudianteService.buscarEstudianteId(12));
		
		Estudiante estudianteA = new Estudiante();
		estudianteA.setId(12);
		estudianteA.setNombre("Ana");
		estudianteA.setApellido("Guevara");
		estudianteA.setFacultad("Facultad de Derecho");
		estudianteA.setCarrera("Derecho");
		
		//ACTUALIZAR ESTUDIANTES
		this.estudianteService.actualizarEstudiante(estudianteA);
		logJava.info("Se ha actualizado el estudiante: " + estudianteA);
		
		//ELIMINAR ESTUDIANTES
		this.estudianteService.eliminarEstudiante(1);
		logJava.info("Se ha eliminado el estudiante");
		
	}

}
