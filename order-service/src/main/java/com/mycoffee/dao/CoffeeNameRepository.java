package com.mycoffee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycoffee.entity.CoffeeName;

@Repository
public interface CoffeeNameRepository extends JpaRepository<CoffeeName, Long> {

}
