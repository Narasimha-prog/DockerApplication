package com.ln;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerSpringBootApp01Application {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootApp01Application.class, args);
		System.out.println("Hi Docker Application");
	}

}
