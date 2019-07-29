package com.mycoffee.model;

import com.mycoffee.entity.CoffeeName;
import com.mycoffee.entity.CoffeeType;

public class CoffeeOrdersDto {

	private int id;
	private int coffeeNameId;
	private int coffeeTypeId;
	private String place;
	private String address;
	private int rating;
	private CoffeeName coffeeName;
	private CoffeeType coffeeType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCoffeeNameId() {
		return coffeeNameId;
	}
	public void setCoffeeNameId(int coffeeNameId) {
		this.coffeeNameId = coffeeNameId;
	}
	public int getCoffeeTypeId() {
		return coffeeTypeId;
	}
	public void setCoffeeTypeId(int coffeeTypeId) {
		this.coffeeTypeId = coffeeTypeId;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	/**
	 * @return the coffeeName
	 */
	public CoffeeName getCoffeeName() {
		return coffeeName;
	}
	/**
	 * @param coffeeName the coffeeName to set
	 */
	public void setCoffeeName(CoffeeName coffeeName) {
		this.coffeeName = coffeeName;
	}
	/**
	 * @return the coffeeType
	 */
	public CoffeeType getCoffeeType() {
		return coffeeType;
	}
	/**
	 * @param coffeeType the coffeeType to set
	 */
	public void setCoffeeType(CoffeeType coffeeType) {
		this.coffeeType = coffeeType;
	}
	
}
