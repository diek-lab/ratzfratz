package de.ratzfratz.ratzfratz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(final String[] args) {
		System.out.println("Hello");
		SpringApplication.run(App.class, args);
	}

}
