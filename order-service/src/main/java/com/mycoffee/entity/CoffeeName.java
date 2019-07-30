package com.mycoffee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_coffee_name")
public class CoffeeName {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "coffee_name")
	private String coffeeName;
	

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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
