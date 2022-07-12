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


		logJava.info("Buscar por cédula Typed: " + this.personaJPAService.buscarPorCedulaTyped("3164214"));
		logJava.info("Buscar por cédula Named: " + this.personaJPAService.buscarPorCedulaNamed("3164214"));
		logJava.info("Buscar por cédula Typed / Named: " + this.personaJPAService.buscarPorCedulaTypedNamed("3164214"));
		
		List<Persona> personas = this.personaJPAService.buscarPorNombreApellido("Domenica", "Erazo");
		
		for (Persona p : personas) {
			logJava.info("Buscar por nombre y apellido (Typed / Named): " + p);
		}
		
		
	}

}
