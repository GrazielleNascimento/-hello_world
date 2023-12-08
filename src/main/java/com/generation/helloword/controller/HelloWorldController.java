package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // define pro spring que é uma classe controladora que vai receber e devolver
				// requisicoes
@RequestMapping("/")
public class HelloWorldController {

	@GetMapping // sempre que o usuario acessar essa URL "/hello-world" buscando informaçoes
				// esse metodo vai ser disparado
	public String HelloWorld() { // executa o metodo e vai retornar "Hello World"
		return "Hello World";
	}

	@GetMapping("BSM")
	public String bsm() {
		return "\nPersistência; " + "\nMentalidade de Crescimento; " + "\nResponsabilidade Pessoal; "
				+ "\nOrientação ao Futuro; " + "\nProatividade; " + "\nComunicação; " + "\nTrabalho em Equipe; "
				+ "\nOrientação ao Detalhe";
	}

	@GetMapping("objetivoAprendizagem")
	public String objAprendizagem() {
		return "\nAprender sobre Spring Boot" +
				"\nEntender o funcionamento de controladores no Spring"
				+ "\nImplementar endpoints em um projeto Spring"
				+ "\nConectar e enviar projetos para repositórios no Github";
	}

}
