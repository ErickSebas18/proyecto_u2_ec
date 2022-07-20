package com.uce.edu.demo;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Ciudadano;
import com.uce.edu.demo.repository.modelo.Empleado;
import com.uce.edu.demo.service.ICiudadanoService;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IPersonaJPAService;

@SpringBootApplication
public class ProyectoU2EcApplication implements CommandLineRunner {

	private static Logger logJava = Logger.getLogger(ProyectoU2EcApplication.class);

	@Autowired
	private IPersonaJPAService personaJPAService;

	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setNombre("Paúl");
		ciudadano.setApellido("Merizalde");
	
		Empleado empleado = new Empleado();
		empleado.setCodigoIess("456134");
		empleado.setSalario(new BigDecimal(500));
		empleado.setCiudadano(ciudadano);
		
		ciudadano.setEmpleado(empleado);
		
		this.ciudadanoService.insertarCiudadano(ciudadano);
	}

}
