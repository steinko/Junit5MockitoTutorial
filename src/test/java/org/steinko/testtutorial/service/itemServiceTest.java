package org.steinko.testtutorial.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.mockito.Mock;
import org.mockito.InjectMocks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.steinko.testtutorial.model.Item;
import org.steinko.testtutorial.repository.ItemsRepository;


@ExtendWith(MockitoExtension.class)
class itemServiceTest {
	@InjectMocks
	private ItemService service = new ItemService();
	
	@Mock
	private ItemsRepository repository;
	
	

	@Test
	public void shouldReturnTheSum() {
		when(repository.findAll()).thenReturn(
				Arrays.asList(new Item(5, "Item5",10,500),
					      new Item(6, "Item6",20,400) 
					));	
		List<Item> items = service.retriveAllItems();
		assertEquals(5000,items.get(0).getValue());
		assertEquals(8000,items.get(1).getValue());
	}
}
