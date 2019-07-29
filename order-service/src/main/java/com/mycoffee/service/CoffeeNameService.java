package com.mycoffee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycoffee.dao.CoffeeNameRepository;
import com.mycoffee.entity.CoffeeName;

@Service
public class CoffeeNameService {

	@Autowired
	private CoffeeNameRepository coffeeNameRepository;
	
	public List<CoffeeName> fetchAllCoffeeNames() {
		return (List<CoffeeName>) coffeeNameRepository.findAll();
	}
}
