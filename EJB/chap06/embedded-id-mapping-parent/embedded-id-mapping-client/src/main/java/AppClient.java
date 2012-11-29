import javax.naming.Context;
import javax.naming.NamingException;

import com.titan.domain.Customer;
import com.titan.domain.CustomerPK;
import com.titan.travelagent.TravelAgentRemote;

public class AppClient {

	public static void main(String[] args) {
		try {
			Context jndiContext = getInitialContext();
			Object ref = jndiContext.lookup("TravelAgentBean/remote");
			TravelAgentRemote dao = (TravelAgentRemote) ref;
			
			CustomerPK pk = new CustomerPK("Burke", 9999999);
			Customer cust = new Customer();
			cust.setPk(pk);
			cust.setFirstName("Bill");
			
			dao.createCustomer(cust);
			
			cust = dao.findCustomer("Burke", 9999999);
			System.out.println(cust.getFirstName());
			System.out.println(cust.getLastName());
			System.out.println(cust.getSsn());
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public static Context getInitialContext()
			throws javax.naming.NamingException {
		return new javax.naming.InitialContext();
	}

}