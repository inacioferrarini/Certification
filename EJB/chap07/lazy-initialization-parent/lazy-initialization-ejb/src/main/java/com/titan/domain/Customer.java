package com.titan.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String firstName;
	private String lastName;
	private boolean hasGoodCredit;

	private Address address;
	private Collection<Phone> phoneNumbers = new ArrayList<Phone>();
	private CreditCard creditCard;
	private Collection<Reservation> reservations = new ArrayList<Reservation>();

	@Id @GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isHasGoodCredit() {
		return hasGoodCredit;
	}

	public void setHasGoodCredit(boolean hasGoodCredit) {
		this.hasGoodCredit = hasGoodCredit;
	}

	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="ADDRESS_ID")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="CUSTOMER_ID")
	public Collection<Phone> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Collection<Phone> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@OneToOne(cascade={CascadeType.ALL})
	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	@ManyToMany(mappedBy="customers")
	public Collection<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Collection<Reservation> reservations) {
		this.reservations = reservations;
	}

}
