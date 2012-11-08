package com.titan.clients;

import javax.naming.Context;

import com.titan.domain.Cabin;
import com.titan.travelagent.TravelAgentRemote;

public class Client {
	public static void main(String[] args) {
		try {
			Context jndiContext = getInitialContext();
			Object ref = jndiContext.lookup("TravelAgentBean/remote");
			TravelAgentRemote dao = (TravelAgentRemote) ref;
			
			Cabin cabin1 = new Cabin();
			cabin1.setId(1);
			cabin1.setName("Master Suite");
			cabin1.setDeckLevel(1);
			cabin1.setShipId(1);
			cabin1.setBedCount(3);
			
			dao.createCabin(cabin1);
			
			Cabin cabin2 = dao.findCabin(1);
			System.out.println(cabin2.getName());
			System.out.println(cabin2.getDeckLevel());
			System.out.println(cabin2.getShipId());
			System.out.println(cabin2.getBedCount());
			
		} catch (javax.naming.NamingException ne) {
			ne.printStackTrace();
		}
	}
	
	public static Context getInitialContext() 
			throws javax.naming.NamingException {
		
		return new javax.naming.InitialContext();
	}
}
