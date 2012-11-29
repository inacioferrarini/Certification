package com.titan.domain;

public class CustomerPK implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String lastName;
	private long ssn;
	
	public CustomerPK() {
		super();
	}

	public CustomerPK(String lastName, long ssn) {
		super();
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getSsn() {
		return ssn;
	}

	public void setSsn(long ssn) {
		this.ssn = ssn;
	}

	public boolean equals(Object obj) {
	      if (obj == this) return true;
	      if (!(obj instanceof CustomerPK)) return false;
	      CustomerPK pk = (CustomerPK)obj;
	      if (!lastName.equals(pk.lastName)) return false;
	      if (ssn != pk.ssn) return false;
	      return true;		
	}
	
	public int hashCode() {
		return lastName.hashCode() + (int)ssn;
	}
	
}
