package com.mycoffee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycoffee.entity.CoffeeOrder;
import com.mycoffee.service.CoffeeOrderService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/coffee")
public class OrderController {

	@Autowired
	private CoffeeOrderService coffeeOrderService;
	
	@GetMapping("/{id}")
	public Optional<CoffeeOrder> find(@PathVariable Long id){
		return this.coffeeOrderService.getCoffeeOrderById(id);
	}
	
	
	@PostMapping()
	public void saveCoffeeOrder(@RequestBody CoffeeOrder order) {
		coffeeOrderService.saveCoffeeOrder(order);
	}
}
