package com.uce.edu.demo;

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

		//logJava.info("Con JPA: " + this.personaJPAService.buscarId(4));

		Persona persona = new Persona();
		//persona.setId(20);
		persona.setNombre("Domenica");
		persona.setApellido("Erazo");

		this.personaJPAService.insertar(persona);
		logJava.info("Se ha insertado: " + persona);

		/*persona.setNombre("Kevin");
		this.personaJPAService.actualizar(persona);
		logJava.info("Se ha actualizado: " + persona);

		this.personaJPAService.eliminar(1);
		logJava.info("Se ha eliminado");*/

	}

}
