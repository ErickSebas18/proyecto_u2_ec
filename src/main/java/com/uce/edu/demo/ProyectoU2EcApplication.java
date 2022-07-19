package com.uce.edu.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;
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

		List<PersonaSencilla> personas = this.personaJPAService.buscarPorApellidoPersonaSencilla("Erazo");
		for (PersonaSencilla p : personas) {
			logJava.info("Persona Sencilla: " + p);
		}
		
		List<PersonaContadorGenero> personasGenero = this.personaJPAService.contarPersonasGenero();
		for (PersonaContadorGenero p : personasGenero) {
			logJava.info("Persona Contador Genero: " + p);
		}
		
	}

}
