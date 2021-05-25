package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")

public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Habilidades e mentalidades que eu utilizei para realizar essa atividade: \n"
				+"Persistência, orientação aos detalhes, responsabilidade pessoal e proatividade";
	}

}
