package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello2")

public class HelloController2 {
	
	@GetMapping
	public String hello2() {
		return "Meus objetivos de aprendizagem para essa semana: \n" 
				+ "Pretendo me esforçar bastante para adquirir este conhecimento, "
				+ "ver vídeos por fora, \nda plataforma, realizar os exescíos e ler os arquivos em pdf "
				+ "são alguns deles.";
		
	}

}
