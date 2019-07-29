package com.mycoffee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_coffee_orders")
public class CoffeeOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "coffee_name_id")
	private int coffeeNameId;
	@Column(name = "coffee_type_id")
	private int coffeeTypeId;
	private String place;
	private String address;
	private int rating;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coffee_name_id", referencedColumnName= "id", nullable=false, insertable=false, updatable=false)
	private CoffeeName coffeeNameEntity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coffee_type_id", referencedColumnName= "id", nullable=false, insertable=false, updatable=false)
	private CoffeeType coffeeTypeEntity;

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
	 * @return the coffeeNameId
	 */
	public int getCoffeeNameId() {
		return coffeeNameId;
	}
	/**
	 * @param coffeeNameId the coffeeNameId to set
	 */
	public void setCoffeeNameId(int coffeeNameId) {
		this.coffeeNameId = coffeeNameId;
	}
	/**
	 * @return the coffeeTypeId
	 */
	public int getCoffeeTypeId() {
		return coffeeTypeId;
	}
	/**
	 * @param coffeeTypeId the coffeeTypeId to set
	 */
	public void setCoffeeTypeId(int coffeeTypeId) {
		this.coffeeTypeId = coffeeTypeId;
	}
	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}
	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	/**
	 * @return the coffeeNameEntity
	 */
	public CoffeeName getCoffeeNameEntity() {
		return coffeeNameEntity;
	}
	/**
	 * @param coffeeNameEntity the coffeeNameEntity to set
	 */
	public void setCoffeeNameEntity(CoffeeName coffeeNameEntity) {
		this.coffeeNameEntity = coffeeNameEntity;
	}
	/**
	 * @return the coffeeTypeEntity
	 */
	public CoffeeType getCoffeeTypeEntity() {
		return coffeeTypeEntity;
	}
	/**
	 * @param coffeeTypeEntity the coffeeTypeEntity to set
	 */
	public void setCoffeeTypeEntity(CoffeeType coffeeTypeEntity) {
		this.coffeeTypeEntity = coffeeTypeEntity;
	}
	
}
