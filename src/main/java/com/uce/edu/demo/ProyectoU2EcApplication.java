package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

		logJava.info("Buscar por cédula Native: " + this.personaJPAService.buscarPorCedulaNative("3164214"));
		
		logJava.info("Buscar por cédula Native / Named: " + this.personaJPAService.buscarPorCedulaNamedNative("3164214"));
		
		logJava.info("Buscar por cédula Criteria API: " + this.personaJPAService.buscarPorCedulaCriteriaApi("3164214"));

		
	}

}
