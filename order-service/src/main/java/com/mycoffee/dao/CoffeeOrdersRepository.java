package com.mycoffee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycoffee.entity.CoffeeOrder;

@Repository
public interface CoffeeOrdersRepository extends CrudRepository<CoffeeOrder, Integer> {

}
