package org.steinko.testtutorial.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorldController {
	@RequestMapping("/hello-world")
	public String helloWorld() { 
		return "Hello World";
	}

}
