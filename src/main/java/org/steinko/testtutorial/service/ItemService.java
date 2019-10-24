package org.steinko.testtutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.steinko.testtutorial.model.Item;
import org.steinko.testtutorial.repository.ItemsRepository;

import java.util.List;
import java.util.ArrayList;

@Service
public class ItemService {
	
	@Autowired
	ItemsRepository repository;
	
	public Item retrieveHardcodedItem()  {
		return null;
	}
	
	public  List<Item>  retriveAllItems() {
		
		return repository.findAll();
	}

}
