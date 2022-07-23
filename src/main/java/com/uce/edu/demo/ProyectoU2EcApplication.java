package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.onetomany.Habitacion;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;
import com.uce.edu.demo.service.IHabitacionService;
import com.uce.edu.demo.service.IHotelService;

@SpringBootApplication
public class ProyectoU2EcApplication implements CommandLineRunner {

	private static Logger logJava = Logger.getLogger(ProyectoU2EcApplication.class);

	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IHabitacionService habitacionService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*Hotel hotel = new Hotel();
		hotel.setNombre("Hilton Colón");
		hotel.setDireccion("Guayaquil");
		
		this.hotelService.insertarHotel(hotel);*/
		
		Hotel hote = new Hotel();
		hote.setId(1);
		
		Habitacion habitacion = new Habitacion();
		habitacion.setNumero("A2341");
		habitacion.setPiso("10");
		habitacion.setTipo("Familiar");
		habitacion.setHotel(hote);
		
		Habitacion habitacion2 = new Habitacion();
		habitacion2.setNumero("A4214");
		habitacion2.setPiso("5");
		habitacion2.setTipo("Matrimonial");
		habitacion2.setHotel(hote);
		
		this.habitacionService.insertarHabitacion(habitacion);
		this.habitacionService.insertarHabitacion(habitacion2);
	}

}
