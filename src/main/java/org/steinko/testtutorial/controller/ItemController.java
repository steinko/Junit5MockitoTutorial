package org.steinko.testtutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.steinko.testtutorial.service.ItemService;
import org.steinko.testtutorial.model.Item;

import java.util.List;

@RestController
public class ItemController {
	
	@Autowired
	ItemService service;
	
	@RequestMapping("/item")
	public Item item() { 
		return new Item(1,"Ball",10,100);
	}
	
	
	@RequestMapping("/item-from-service")
	public Item getItemFromServcie() { 
		return service.retrieveHardcodedItem();
	}
	
	@RequestMapping("/all-items")
	public List getAllItems() { 
		return service.retriveAllItems();
	}

}
