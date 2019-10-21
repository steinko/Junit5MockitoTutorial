package org.steinko.testturial.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.skyscreamer.jsonassert.JSONAssert;
import org.junit.jupiter.api.Test;
import org.json.JSONException;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ItemControllerIT {
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void souldHaveLodedContext() throws JSONException { 
		String respons = this.restTemplate.getForObject("/all-items",String.class);
		JSONAssert.assertEquals("[{id: 1001},{id: 1002}]",respons,false);
		
	}

}
