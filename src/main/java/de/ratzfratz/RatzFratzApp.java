package de.ratzfratz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@EntityScan(basePackages = {"de.ratzfratz.entities"})
@ComponentScan (basePackages = {"de.ratzfratz.controller"})
public class RatzFratzApp {

	public static void main(final String[] args) {
		SpringApplication.run(RatzFratzApp.class, args);
	}

}
