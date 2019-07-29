package com.mycoffee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycoffee.dao.CoffeeNameDao;
import com.mycoffee.entity.CoffeeName;

@Component
public class CoffeeNameService {

	@Autowired
	private CoffeeNameDao coffeeNameDao;
	
	public List<CoffeeName> fetchAllCoffeeNames() {
		return (List<CoffeeName>) coffeeNameDao.findAll();
	}
}
