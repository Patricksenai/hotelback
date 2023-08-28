package com.hotel.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;
import classes.Endereco;
import classes.Hotel;
import classes.Pessoa;

@SpringBootApplication
public class HotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);



	}

	
	

}
