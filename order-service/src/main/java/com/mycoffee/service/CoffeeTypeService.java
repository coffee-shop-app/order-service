package com.mycoffee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycoffee.dao.CoffeeTypeRepository;
import com.mycoffee.entity.CoffeeType;

@Service
public class CoffeeTypeService {

	@Autowired
	private CoffeeTypeRepository coffeeTypeRepository;
	
	public List<CoffeeType> fetchAllCoffeeTypes() {
		return (List<CoffeeType>) coffeeTypeRepository.findAll();
	}
}
