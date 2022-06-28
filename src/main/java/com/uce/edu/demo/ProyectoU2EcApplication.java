package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.service.IPersonaJdbcService;
import com.uce.edu.demo.to.Persona;

@SpringBootApplication
public class ProyectoU2EcApplication implements CommandLineRunner{
	
	private static Logger logJava = Logger.getLogger(ProyectoU2EcApplication.class);
	
	@Autowired
	private IPersonaJdbcService personaJdbcService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Persona persona = new Persona();
		persona.setId(20);
		persona.setNombre("Erick");
		persona.setApellido("Chávez");
		//this.personaJdbcService.guardarPersona(persona);
		
		Persona per1 = new Persona();
		per1.setId(4);
		per1.setNombre("Erick");
		per1.setApellido("Velez");
		//this.personaJdbcService.actualizar(per1);
		
		//this.personaJdbcService.eliminarPersona(15);
		
		logJava.info(this.personaJdbcService.buscarPersonaId(4));
	}

}
