package com.titan.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ship implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private double tonnage;

	public Ship() {
		super();
	}

	public Ship(String name, double tonnage) {
		super();
		this.name = name;
		this.tonnage = tonnage;
	}

	@Id @GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTonnage() {
		return tonnage;
	}

	public void setTonnage(double tonnage) {
		this.tonnage = tonnage;
	}

	
	
}
