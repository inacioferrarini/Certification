package com.titan.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Customer implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String firstName;
	private CustomerPK pk;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@EmbeddedId
	@AttributeOverrides({
		@AttributeOverride(name="lastName", column=@Column(name="LAST_NAME")),
		@AttributeOverride(name="ssn", column=@Column(name="SSN"))
	})
	public CustomerPK getPk() {
		return pk;
	}

	public void setPk(CustomerPK pk) {
		this.pk = pk;
	}
	
	@Transient
	public String getLastName() {
		return pk.getLastName();
	}
	
	@Transient
	public long getSsn() {
		return pk.getSsn();
	}
	
}
