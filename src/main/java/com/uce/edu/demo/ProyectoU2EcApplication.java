package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Ciudadano;
import com.uce.edu.demo.repository.modelo.Empleado;
import com.uce.edu.demo.repository.modelo.Pasaporte;
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
		ciudadano.setNombre("Andrea");
		ciudadano.setApellido("García");
		ciudadano.setCedula("1155614");
		ciudadano.setFechaNacimiento(LocalDateTime.now());
		
		Pasaporte pasaporte = new Pasaporte();
		pasaporte.setNumero("65324");
		pasaporte.setFechaEmision(LocalDateTime.now());
		pasaporte.setFechaCaducidad(LocalDateTime.of(2025, 05, 23, 12, 00));
		
		pasaporte.setCiudadano(ciudadano);
		ciudadano.setPasaporte(pasaporte);
		
		this.ciudadanoService.insertarCiudadano(ciudadano);
		logJava.info("Se ha insertado un ciudadano: " + ciudadano);
		
		logJava.info("Se ha buscado el ciudadano: " + this.ciudadanoService.buscar(5));
		
		Ciudadano buscado = this.ciudadanoService.buscar(3);
		buscado.setNombre("Alfonso");
		
		Pasaporte pasaporte2 = new Pasaporte();
		pasaporte2.setFechaEmision(LocalDateTime.now());
		pasaporte2.setFechaCaducidad(LocalDateTime.of(2030, 04, 12, 00, 00));
		pasaporte2.setNumero("461342");
		pasaporte2.setCiudadano(buscado);
		
		buscado.setPasaporte(pasaporte2);
		
		this.ciudadanoService.actualizar(buscado);
		
		logJava.info("Se ha actualizado el ciudadano: " + buscado);
		
		this.ciudadanoService.eliminar(2);
		
		logJava.info("Se ha eliminado el ciudadano");
		
	}

}
