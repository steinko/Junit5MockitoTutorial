package org.steinko.testtutorial.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.steinko.testtutorial.model.Item;

@Repository
public interface ItemsRepository  extends JpaRepository<Item,Long>{

}
