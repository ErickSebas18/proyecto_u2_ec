package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IPersonaJPAService;

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
		
		Estudiante estudiante = new Estudiante();
		estudiante.setId(90);
		estudiante.setNombre("Carlos");
		estudiante.setApellido("Carrera");
		estudiante.setFacultad("Facultad de Medicina");
		estudiante.setCarrera("Enfermería");
		
		//this.estudianteService.insertarEstudiante(estudiante);
		logJava.info("Se ha ingresado el estudiante: " + estudiante);
		
		logJava.info("El estudiante buscado es: " + this.estudianteService.buscarEstudiante(5));
		
		Estudiante estudiante2 =  new Estudiante();
		estudiante2.setId(12);
		estudiante2.setNombre("Ana");
		estudiante2.setApellido("Garcia");
		estudiante2.setFacultad("Facultad de Derecho");
		estudiante2.setCarrera("Derecho");
		
		this.estudianteService.actualizarEstudiante(estudiante2);
		logJava.info("Se ha actualizado el estudiante : " + estudiante2);
		
		this.estudianteService.eliminarEstudiante(90);
		logJava.info("Se ha eliminado el estudiante");
		
	}

}
