import javax.naming.Context;

import com.titan.travelagent.TravelAgentRemote;

public class AppClient {

	public static void main(String[] args) {
		try {
			Context jndiContext = getInitialContext();
			Object ref = jndiContext.lookup("TravelAgentBean/remote");
			TravelAgentRemote dao = (TravelAgentRemote) ref;

			dao.flushModeExample();
		} catch (javax.naming.NamingException ne) {
			ne.printStackTrace();
		}
	}

	public static Context getInitialContext()
			throws javax.naming.NamingException {
		return new javax.naming.InitialContext();
	}

}