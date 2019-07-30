package com.mycoffee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_coffee_orders")
public class CoffeeOrder {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String place;
	
	private String address;
	
	private Long rating;
	
	@OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "coffee_name_id", nullable = false)
    private CoffeeName coffeeName;
	
	@OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "coffee_type_id", nullable = false)
    private CoffeeType coffeeType;

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

	public Long getRating() {
		return rating;
	}

	public void setRating(Long rating) {
		this.rating = rating;
	}

	public CoffeeName getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(CoffeeName coffeeName) {
		this.coffeeName = coffeeName;
	}

	public CoffeeType getCoffeeType() {
		return coffeeType;
	}

	public void setCoffeeType(CoffeeType coffeeType) {
		this.coffeeType = coffeeType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
}
