package org.steinko.testtutorial.service;

import org.steinko.testtutorial.model.Item;

public class ItemService {
	public Item retrieveHardcodedItem()  {
		return new Item(0,"",0,0);
	}

}
