package com.mycoffee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycoffee.dao.CoffeeOrdersRepository;
import com.mycoffee.entity.CoffeeOrder;
import com.mycoffee.model.CoffeeOrdersDto;

@Service
public class CoffeeOrderService {

	@Autowired
	private CoffeeOrdersRepository coffeeOrdersRepository;
	
	public void saveCoffeeOrder(CoffeeOrdersDto coffeeOrderDto) {
		coffeeOrdersRepository.save(toCoffeeOrderEntity(coffeeOrderDto));
	}
	
	private CoffeeOrder toCoffeeOrderEntity(CoffeeOrdersDto coffeeOrderDto) {
		CoffeeOrder coffeeOrder = new CoffeeOrder();
		
		coffeeOrder.setCoffeeNameId(coffeeOrderDto.getCoffeeNameId());
		coffeeOrder.setCoffeeTypeId(coffeeOrderDto.getCoffeeTypeId());
		coffeeOrder.setPlace(coffeeOrderDto.getPlace());
		coffeeOrder.setAddress(coffeeOrderDto.getAddress());
		coffeeOrder.setRating(coffeeOrderDto.getRating());
		
		return coffeeOrder;
	}

	public List<CoffeeOrder> getAllCoffeeOrders() {
		return (List<CoffeeOrder>) coffeeOrdersRepository.findAll();
	}
	
	public CoffeeOrder getCoffeeOrderById(int id) {
		Optional<CoffeeOrder> coffeOrder = coffeeOrdersRepository.findById(id);
        return coffeOrder.orElseThrow(() -> new RuntimeException("Couldn't find a Dog with id: " + id));
	}

}
