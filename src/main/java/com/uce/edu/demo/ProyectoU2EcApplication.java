package com.uce.edu.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IPersonaJPAService;

@SpringBootApplication
public class ProyectoU2EcApplication implements CommandLineRunner {

	private static Logger logJava = Logger.getLogger(ProyectoU2EcApplication.class);

	@Autowired
	private IPersonaJPAService personaJPAService;

	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("Patricio");
		estudiante.setApellido("Zeas");
		estudiante.setFacultad("Facultad de Derecho");
		estudiante.setCarrera("Derecho Constitucional");
		estudiante.setGenero("M");
		estudiante.setEstadoCivil("Comprometido");
		estudiante.setNumeroMatricula("93124");

		// this.estudianteService.insertarEstudiante(estudiante);
		// logJava.info("Se ha insertado: " + estudiante);

		logJava.info("Ejemplo Query: " + this.estudianteService.buscarPorNumeroMatriculaQuery("45134"));
		logJava.info("Ejemplo Query: " + this.estudianteService
				.actualizarFacultadCarreraQuery("Facultad de las Discapacidades", "Fisioterapia Deportiva", 3));
		
		logJava.info("Ejemplo Typed: " + this.estudianteService.buscarPorNumeroMatriculaNombreApellidoTyped("23145", "Cristian", "Muñoz"));
		
		List<Estudiante> estudiantes = this.estudianteService.buscarPorGeneroEstadoCivilTyped("F", "Soltera");
		for (Estudiante e : estudiantes) {
			logJava.info("Ejemplo Typed: " + e);
		}
		
		List<Estudiante> estudiantes2 = this.estudianteService.buscarEstudiantePorFacultadOCarreraNamed("Facultad de Ingeniería", "Medicina");
		for(Estudiante e2 : estudiantes2) {
			logJava.info("Ejemplo Named: " + e2);
		}
		
		List<Estudiante> estudiantes3 = this.estudianteService.buscarporNombreEstadoCivilTypedNamed("Daniela", "Soltera");
		for(Estudiante e3 : estudiantes3) {
			logJava.info("Ejemplo Named: " + e3);
		}
		
		/*
		 * logJava.info("Buscar por cédula Typed: " +
		 * this.personaJPAService.buscarPorCedulaTyped("3164214"));
		 * logJava.info("Buscar por cédula Named: " +
		 * this.personaJPAService.buscarPorCedulaNamed("3164214"));
		 * logJava.info("Buscar por cédula Typed / Named: " +
		 * this.personaJPAService.buscarPorCedulaTypedNamed("3164214"));
		 * 
		 * List<Persona> personas =
		 * this.personaJPAService.buscarPorNombreApellido("Domenica", "Erazo");
		 * 
		 * for (Persona p : personas) {
		 * logJava.info("Buscar por nombre y apellido (Typed / Named): " + p); }
		 */

	}

}
