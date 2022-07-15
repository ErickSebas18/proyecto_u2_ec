package com.uce.edu.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Estudiante;
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
		
		List<Estudiante> estudiantes1 = this.estudianteService.buscarPorNombreApellidoNative("Daniela", "Zeas");
		for(Estudiante e: estudiantes1) {
			logJava.info("Buscar por Native: " + e);
		}
		
		logJava.info("Buscar por Native: " + this.estudianteService.buscarPorNumeroMatriculaNative("36214"));
		
		List<Estudiante> estudiantes2 = this.estudianteService.buscarPorCarreraNamedNative("Psicologia");
		for (Estudiante e : estudiantes2) {
			logJava.info("Buscar por Named Native: " + e);
		}
		
		List<Estudiante> estudiantes3 = this.estudianteService.buscarPorEstadoCivilOGeneroNamedNative("Soltero", "F");
		for (Estudiante e : estudiantes3) {
			logJava.info("Buscar por Named Native: " + e);
		}
		
		
		
		
	}

}
