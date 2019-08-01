package com.mycoffee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycoffee.dao.CoffeeOrdersRepository;
import com.mycoffee.entity.CoffeeOrder;

@Service
public class CoffeeOrderService {

	@Autowired
	private CoffeeOrdersRepository coffeeOrdersRepository;
	
	/**
	 * @param coffeeOrderDto
	 */
	public void saveCoffeeOrder(CoffeeOrder order) {
		coffeeOrdersRepository.saveAndFlush(order);
	}
	


	/**
	 * @return
	 */
	public List<CoffeeOrder> getAllCoffeeOrders() {
		return coffeeOrdersRepository.findAll();
	}
	
	/**
	 * @param id
	 * @return
	 */
	public Optional<CoffeeOrder> getCoffeeOrderById(Long id) {
        return coffeeOrdersRepository.findById(id);
	}

}
