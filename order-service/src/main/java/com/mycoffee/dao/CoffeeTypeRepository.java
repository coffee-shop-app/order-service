package com.mycoffee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycoffee.entity.CoffeeType;

@Repository
public interface CoffeeTypeRepository extends JpaRepository<CoffeeType, Integer> {

}
