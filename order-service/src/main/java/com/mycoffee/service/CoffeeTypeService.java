package com.mycoffee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycoffee.dao.CoffeeTypeDao;
import com.mycoffee.entity.CoffeeType;

@Component
public class CoffeeTypeService {

	@Autowired
	private CoffeeTypeDao coffeeTypeDao;
	
	public List<CoffeeType> fetchAllCoffeeTypes() {
		return (List<CoffeeType>) coffeeTypeDao.findAll();
	}
}
