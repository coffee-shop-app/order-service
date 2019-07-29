package com.mycoffee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycoffee.dao.CoffeeOrdersDao;
import com.mycoffee.entity.CoffeeOrder;
import com.mycoffee.model.CoffeeOrdersDto;

@Component
public class CoffeeOrderService {

	@Autowired
	private CoffeeOrdersDao coffeeOrdersDao;
	
	public void saveCoffeeOrder(CoffeeOrdersDto coffeeOrderDto) {
		coffeeOrdersDao.save(toCoffeeOrderEntity(coffeeOrderDto));
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
		return (List<CoffeeOrder>) coffeeOrdersDao.findAll();
	}
	
	public CoffeeOrder getCoffeeOrderById(int id) {
		Optional<CoffeeOrder> coffeOrder = coffeeOrdersDao.findById(id);
        return coffeOrder.orElseThrow(() -> new RuntimeException("Couldn't find a Dog with id: " + id));
	}

}
