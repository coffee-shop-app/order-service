package com.mycoffee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycoffee.dao.CoffeeNameRepository;
import com.mycoffee.dao.CoffeeTypeRepository;
import com.mycoffee.entity.CoffeeName;
import com.mycoffee.entity.CoffeeType;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/data/coffee")
public class StaticDataController {

	@Autowired
	private CoffeeNameRepository coffeeNameRepository;
	
	@Autowired
	private CoffeeTypeRepository coffeeTypeRepository;
	
	/**
	 * @return
	 */
	@GetMapping("/names")
	public List<CoffeeName> getCoffeeNames() {
		return coffeeNameRepository.findAll();
	}
	
	/**
	 * @return
	 */
	@GetMapping("/types")
	public List<CoffeeType> getCoffeeTypes() {	
		return coffeeTypeRepository.findAll();
	}
}
