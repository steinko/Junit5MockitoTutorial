package org.steinko.testtutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.steinko.testtutorial.model.Item;
import org.steinko.testtutorial.repository.ItemsRepository;

import java.util.List;
import java.util.ArrayList;

public class ItemService {
	
	@Autowired
	ItemsRepository repository;
	
	public Item retrieveHardcodedItem()  {
		return null;
	}
	
	public  List<Item>  retriveAllItems() {
		Iterable<Item> items = repository.findAll();
		List<Item> result = new ArrayList<Item>();
		
        for (Item item:items ) 
        	result.add(item);
		return result;
	}

}
