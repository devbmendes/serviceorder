package com.devbmendes.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devbmendes.backend.model.Client;
import com.devbmendes.backend.model.Priority;
import com.devbmendes.backend.model.SO;
import com.devbmendes.backend.model.Status;
import com.devbmendes.backend.model.Technicien;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Technicien t1 = new Technicien(null,"Balduino Mendes","234567889");
		Client c1 = new Client(null,"Everton Ribeiro", "543789786");
		SO so1 = new SO(null,Priority.HIGHT,"Test",Status.ONGOING,t1,c1);
		
	}

}
