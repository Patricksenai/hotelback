package com.hotel.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;
import classes.Hotel;

@SpringBootApplication
public class HotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);


		Hotel nome = new Hotel("Hotel JPR", "Rua do Hotel, 607");
		System.out.println(nome.nomeHotel);
		System.out.println(nome.endereco);
		System.out.println(nome.getCnpj());

	}

	
	

}
