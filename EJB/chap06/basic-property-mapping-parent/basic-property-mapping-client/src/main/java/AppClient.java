import javax.naming.Context;
import javax.naming.NamingException;

import com.titan.domain.Customer;
import com.titan.domain.CustomerType;
import com.titan.domain.JPEG;
import com.titan.travelagent.TravelAgentRemote;

public class AppClient {

	public static void main(String[] args) {

		try {
			Context jndiContext = getInitialContext();
			Object ref = jndiContext.lookup("TravelAgentBean/remote");
			TravelAgentRemote dao = (TravelAgentRemote) ref;

			Customer cust = new Customer();
			cust.setFirstName("Bill");
			cust.setLastName("Burke");
			cust.setCustomerType(CustomerType.BIG_SPENDAH);

			JPEG oneUglyDude = new JPEG();
			cust.setPicture(oneUglyDude);

			int pk = dao.createCustomer(cust);

			cust = dao.findCustomer(pk);
			System.out.println(cust.getFirstName());
			System.out.println(cust.getLastName());
			System.out.println(cust.getCustomerType());

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public static Context getInitialContext()
			throws javax.naming.NamingException {
		return new javax.naming.InitialContext();
	}

}