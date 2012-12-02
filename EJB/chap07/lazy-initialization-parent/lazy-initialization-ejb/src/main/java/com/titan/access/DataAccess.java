package com.titan.access;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface DataAccess {
	String initializeDatabase();
	public List fetchReservations();
	public List fetchReservationsWithRelationships();
}
