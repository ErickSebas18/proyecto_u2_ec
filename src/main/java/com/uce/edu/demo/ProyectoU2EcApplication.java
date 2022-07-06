package com.uce.edu.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.service.IPersonaJPAService;

@SpringBootApplication
public class ProyectoU2EcApplication implements CommandLineRunner {

	private static Logger logJava = Logger.getLogger(ProyectoU2EcApplication.class);

	@Autowired
	private IPersonaJPAService personaJPAService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub


		Persona persona = new Persona();
		//persona.setId(20);
		persona.setNombre("Domenica");
		persona.setApellido("Erazo");
		persona.setCedula("123451");
		persona.setGenero("F");

		//this.personaJPAService.insertar(persona);
		logJava.info("Se ha insertado: " + persona);

		Persona persona1 = new Persona();
		persona1.setNombre("Erick");
		persona1.setApellido("Erazo");
		persona1.setCedula("512346");
		persona1.setGenero("M");
		//this.personaJPAService.insertar(persona1);
		
		logJava.info("Con JPA: " + this.personaJPAService.buscarPorCedula(persona.getCedula()));
		
		List<Persona> listPersona = this.personaJPAService.buscarPorApellido("Erazo");
		for (Persona item:listPersona) {
			logJava.info("Persona: " + item);
		}
		
	}

}
