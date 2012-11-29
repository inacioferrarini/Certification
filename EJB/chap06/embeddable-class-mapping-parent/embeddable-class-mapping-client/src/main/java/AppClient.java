import javax.naming.Context;

import com.titan.domain.Address;
import com.titan.domain.Customer;
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
			Address address = new Address();
			address.setStreet("Clarendon Street");
			address.setCity("Boston");
			address.setState("MA");
			cust.setAddress(address);

			long pk = dao.createCustomer(cust);

			Address foundAddress = dao.findAddress(pk);
			System.out.println(foundAddress.getStreet());
			System.out.println(foundAddress.getCity());
			System.out.println(foundAddress.getState());
		} catch (javax.naming.NamingException ne) {
			ne.printStackTrace();
		}
	}

	public static Context getInitialContext()
			throws javax.naming.NamingException {
		return new javax.naming.InitialContext();
	}

}