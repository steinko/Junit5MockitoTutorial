package org.steinko.testtutorial.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.steinko.testtutorial.model.Item;

@Repository
public interface ItemsRepository  extends CrudRepository<Item,Long>{

}
