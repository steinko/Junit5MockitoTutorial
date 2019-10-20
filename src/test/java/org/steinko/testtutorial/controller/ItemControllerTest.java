package org.steinko.testtutorial.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;


import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.mockito.Mockito.when;

import org.steinko.testtutorial.model.Item;
import org.steinko.testtutorial.service.ItemService;

import java.lang.Exception;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@WebMvcTest(ItemController.class)

public class ItemControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ItemService service;
	
	
	
	@Test
	public void shouldReturnHelloWorldConent() throws Exception{ 
		
		when(service.retrieveHardcodedItem()).thenReturn(
				new Item(2, "Item2",10,100));
		
		RequestBuilder request = MockMvcRequestBuilders
				.get("/item-from-service")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{id: 2,name: Item2, price: 10, quantity: 100}"))
				.andReturn();
		
		
	}
	
	@Test
	public void shouldReturnAllItems() throws Exception{ 
		
		when(service.retriveAllItems()).thenReturn(
				Arrays.asList(new Item(3, "Item3",30,300)));
		
		RequestBuilder request = MockMvcRequestBuilders
				.get("/all-items")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("[{id: 3,name: Item3, price: 30, quantity: 300}]"))
				.andReturn();
		
		
	}
	
	@Test
	public void shouldRetunItem() throws Exception {
		
		RequestBuilder request = MockMvcRequestBuilders
				.get("/item")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{id: 1, name: Ball, price: 10, quantity: 100}"))
				.andReturn();
		
	}

}

