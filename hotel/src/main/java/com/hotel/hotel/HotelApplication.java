package com.hotel.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;
import classes.Hotel;
import classes.Pessoa;

@SpringBootApplication
public class HotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);


		Hotel nome = new Hotel("Hotel JPR", "Rua do Hotel, 607");
		System.out.println(nome.nomeHotel);
		System.out.println(nome.endereco);
		System.out.println(nome.getCnpj());
		System.out.println("-----------------------------------------");


		Pessoa pessoaCliente01 = new Pessoa("Joao", "joaovmiguez@gmail.com", "01236748397");
		System.out.println("            CLIENTES              ");
		System.out.println("");
		System.out.println(pessoaCliente01.nome);
		System.out.println(pessoaCliente01.email);
		System.out.println(pessoaCliente01.getCpf());
		System.out.println("");

		Pessoa pessoaCliente02 = new Pessoa("Pedro", "pedro@gmail.com", "02356471923");
		System.out.println("");
		System.out.println(pessoaCliente02.nome);
		System.out.println(pessoaCliente02.email);
		System.out.println(pessoaCliente02.getCpf());
		System.out.println("-----------------------------------------");
		System.out.println("");

	}

	
	

}
