package com.titan.travelagent;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.titan.domain.Customer;

@Stateful
public class TravelAgentBean implements TravelAgentRemote {

	@PersistenceContext(unitName="titan") private EntityManager manager;
	
	@Override
	public int createCustomer(Customer cust) {
		manager.persist(cust);
		return cust.getId();
	}

	@Override
	public Customer findCustomer(int pKey) {
		return manager.find(Customer.class, pKey);
	}

}
