package org.steinko.testtutorial.repository;


import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.steinko.testtutorial.model.Item;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class ItemsRepositoryTest {
	
	@Autowired
	private ItemsRepository repository;
	
	@Test
	public void shouldRetiveAllItems() {
		List<Item> items = repository.findAll();
		assertEquals(3, items.size());
	}
	

}
