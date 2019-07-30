package com.mycoffee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycoffee.entity.CoffeeOrder;

@Repository
public interface CoffeeOrdersRepository extends JpaRepository<CoffeeOrder, Long> {

}
