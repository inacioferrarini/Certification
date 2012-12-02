package com.titan.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Reservation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private Date date;
	private double amountPaid;
	private Cruise cruise;
	private Set<Cabin> cabins = new HashSet<Cabin>();
	private Set<Customer> customers = new HashSet<Customer>();
	
	@Id @GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	@ManyToOne
	@JoinColumn(name="CRUISE_ID")
	public Cruise getCruise() {
		return cruise;
	}

	public void setCruise(Cruise cruise) {
		this.cruise = cruise;
	}
	
	@ManyToMany
	@JoinTable(name="RESERVATION_CABIN",
			joinColumns={@JoinColumn(name="RESERVATION_ID")},
			inverseJoinColumns={@JoinColumn(name="CABIN_ID")})
	public Set<Cabin> getCabins() {
		return cabins;
	}

	public void setCabins(Set<Cabin> cabins) {
		this.cabins = cabins;
	}

	@ManyToMany
	@JoinTable(name="RESERVATION_CUSTOMER",
			joinColumns={@JoinColumn(name="RESERVATION_ID")},
			inverseJoinColumns={@JoinColumn(name="CUSTOMER_ID")})
	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

}
