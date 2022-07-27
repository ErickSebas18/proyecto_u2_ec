package com.uce.edu.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.cajero.modelo.DetalleFactura;
import com.uce.edu.demo.cajero.modelo.Factura;
import com.uce.edu.demo.cajero.service.IFacturaService;
import com.uce.edu.demo.service.IAutor2Service;
import com.uce.edu.demo.service.ILibro2Service;

@SpringBootApplication
public class ProyectoU2EcApplication implements CommandLineRunner {

	private static Logger logJava = Logger.getLogger(ProyectoU2EcApplication.class);

	@Autowired
	private ILibro2Service libro2Service;

	@Autowired
	private IAutor2Service autor2Service;

	@Autowired
	private IFacturaService facturaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Factura factura = this.facturaService.buscar(1);

		logJava.info("Numero: " + factura.getNumero());
		logJava.info("Fecha: " + factura.getFecha());
		logJava.info("Cliente: " + factura.getCliente().getNumeroTarjeta());
		List<DetalleFactura> detalles = factura.getDetalleFacturas();
		
		for(DetalleFactura d : detalles) {
			logJava.info("Detalles: " + d);
		}
		

	}

}
