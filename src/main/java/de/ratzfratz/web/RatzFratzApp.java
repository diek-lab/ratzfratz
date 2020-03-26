package de.ratzfratz.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EnableAutoConfiguration
@SpringBootApplication
@EntityScan(basePackages = {"de.ratzfratz.entities"})
public class RatzFratzApp {

	public static void main(final String[] args) {
		SpringApplication.run(RatzFratzApp.class, args);
	}

}
