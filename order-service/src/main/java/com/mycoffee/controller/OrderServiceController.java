package com.mycoffee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycoffee.entity.CoffeeName;
import com.mycoffee.entity.CoffeeType;
import com.mycoffee.model.CoffeeNameDto;
import com.mycoffee.model.CoffeeOrdersDto;
import com.mycoffee.model.CoffeeTypeDto;
import com.mycoffee.service.CoffeeNameService;
import com.mycoffee.service.CoffeeOrderService;
import com.mycoffee.service.CoffeeTypeService;

@RestController
@RequestMapping("/coffee")
public class OrderServiceController {

	@Autowired
	private CoffeeOrderService coffeeOrderService;
	
	@Autowired
	private CoffeeNameService coffeeNameService;
	
	@Autowired
	private CoffeeTypeService coffeeTypeService;
	
	@GetMapping("/names")
	public List<CoffeeNameDto> getCoffeeNames() {
		
		List<CoffeeNameDto> coffeeNameDtoList = new ArrayList<CoffeeNameDto>();
		
		List<CoffeeName> coffeeNameList = coffeeNameService.fetchAllCoffeeNames();
		
		coffeeNameList.forEach(coffeeName -> {
			CoffeeNameDto coffeeNameDto = new CoffeeNameDto();
			coffeeNameDto.setId(coffeeName.getId());
			coffeeNameDto.setCoffeeName(coffeeName.getCoffeeName());
			
			coffeeNameDtoList.add(coffeeNameDto);
		});
		
		return coffeeNameDtoList;
	}
	@GetMapping("/types")
	public List<CoffeeTypeDto> getCoffeeTypes() {
		
		List<CoffeeTypeDto> coffeeTypeDtoList = new ArrayList<CoffeeTypeDto>();
		
		List<CoffeeType> coffeeTypeList = coffeeTypeService.fetchAllCoffeeTypes();
		
		coffeeTypeList.forEach(coffeeType -> {
			
			CoffeeTypeDto coffeeTypeDto = new CoffeeTypeDto();
			
			coffeeTypeDto.setId(coffeeType.getId());
			coffeeTypeDto.setCoffeeType(coffeeType.getCoffeeType());
			
			coffeeTypeDtoList.add(coffeeTypeDto);
		});
		
		return coffeeTypeDtoList;
	}
	@PostMapping("/saveOrder")
	public void saveCoffeeOrder(@RequestBody CoffeeOrdersDto coffeeOrdersDto) {
		
		coffeeOrderService.saveCoffeeOrder(coffeeOrdersDto);
	}
}
