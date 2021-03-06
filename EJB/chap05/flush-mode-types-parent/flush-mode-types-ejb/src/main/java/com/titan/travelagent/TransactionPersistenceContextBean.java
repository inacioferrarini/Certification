package com.titan.travelagent;

import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.titan.domain.Cabin;

@Stateful
public class TransactionPersistenceContextBean implements
		TransactionPersistenceContextRemote {
	@PersistenceContext(unitName = "titan", type = PersistenceContextType.TRANSACTION)
	private EntityManager manager;

	private Cabin cabin;

	public void setCabin(int pk) {
		cabin = manager.find(Cabin.class, pk);
	}

	public void updateBedCount(int newBedCount) {
		cabin.setBedCount(newBedCount);
	}

	@Remove
	public void remove() {
	}
}
