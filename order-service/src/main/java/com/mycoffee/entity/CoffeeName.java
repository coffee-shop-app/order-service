package com.mycoffee.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_coffee_name")
public class CoffeeName {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "coffee_name")
	private String coffeeName;
	@OneToMany(mappedBy = "coffeeNameEntity", fetch = FetchType.LAZY)
	private List<CoffeeOrder> coffeeNamesOrderList;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the coffeeName
	 */
	public String getCoffeeName() {
		return coffeeName;
	}
	/**
	 * @param coffeeName the coffeeName to set
	 */
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	/**
	 * @return the coffeeNamesOrderList
	 */
	public List<CoffeeOrder> getCoffeeNamesOrderList() {
		return coffeeNamesOrderList;
	}
	/**
	 * @param coffeeNamesOrderList the coffeeNamesOrderList to set
	 */
	public void setCoffeeNamesOrderList(List<CoffeeOrder> coffeeNamesOrderList) {
		this.coffeeNamesOrderList = coffeeNamesOrderList;
	}
	
}
