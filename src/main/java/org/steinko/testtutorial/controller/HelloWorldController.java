package org.steinko.testtutorial.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {
	@GetMapping("/hello-world")
	public String helloWorld() { 
		return "Hello World";
	}

}
