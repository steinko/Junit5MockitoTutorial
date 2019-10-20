package org.steinko.testtutorial.controller;

import org.springframework.web.bind.annotation.RestController;
import org.steinko.testtutorial.model.Item;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ItemController {
	@RequestMapping("/item")
	public Item itenm() { 
		return new Item(1,"Ball",10,100);
	}

}
