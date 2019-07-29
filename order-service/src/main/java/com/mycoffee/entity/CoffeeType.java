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
@Table(name = "tbl_coffee_type")
public class CoffeeType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "coffee_type")
	private String coffeeType;
	@OneToMany(mappedBy = "coffeeTypeEntity", fetch = FetchType.LAZY)
	private List<CoffeeOrder> coffeeTypeOrderList;
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
	 * @return the coffeeType
	 */
	public String getCoffeeType() {
		return coffeeType;
	}
	/**
	 * @param coffeeType the coffeeType to set
	 */
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	/**
	 * @return the coffeeTypeOrderList
	 */
	public List<CoffeeOrder> getCoffeeTypeOrderList() {
		return coffeeTypeOrderList;
	}
	/**
	 * @param coffeeTypeOrderList the coffeeTypeOrderList to set
	 */
	public void setCoffeeTypeOrderList(List<CoffeeOrder> coffeeTypeOrderList) {
		this.coffeeTypeOrderList = coffeeTypeOrderList;
	}
	
}
