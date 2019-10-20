package org.steinko.testtutorial.business;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MessageController {
	@RequestMapping("/message")
	Message message() { 
		return new Message("Hello from Google Cloud", "High");
	}

}
