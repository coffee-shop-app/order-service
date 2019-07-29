package com.mycoffee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycoffee.entity.CoffeeName;

@Repository
public interface CoffeeNameDao extends CrudRepository<CoffeeName, Integer> {

}
