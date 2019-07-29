package com.mycoffee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycoffee.entity.CoffeeType;

@Repository
public interface CoffeeTypeRepository extends CrudRepository<CoffeeType, Integer> {

}
