package com.spring.ejemplospring1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //las anotaciones empiezan por @
@RestController //habilita la clase para que actue cómo punto de entrada de peticiones HTTP. Devuelve JSON
public class Ejemplospring1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejemplospring1Application.class, args);
	}

	@GetMapping("/hola")
	public String holaMundo() {
        return "Hola mundo";
    } 
}
