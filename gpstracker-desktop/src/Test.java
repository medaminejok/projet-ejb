


import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import dao.IVehicule;
import entities.Vehicule;




public class Test {

	public static IVehicule lookUp() throws NamingException {
		Hashtable<Object, Object> config = new Hashtable<Object, Object>();
		config.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		config.put(Context.PROVIDER_URL, "http-remoting://localhost:8099");
		final Context context = new InitialContext(config);
		return  (IVehicule) context.lookup("ejb:/LocalisationEJB-SERVER/VEH!dao.IVehicule");
	}
	public static void main(String[] args) {
		IVehicule remote;
		try {
			remote = lookUp();
			remote.ajouter(new Vehicule("VA1455","DACIA","Coper"));
			remote.ajouter(new Vehicule("A26T567","Audi","Sport"));
			
			for(Vehicule v:remote.findAll()) {
				System.out.println(v.getMatricule());
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
        
        
	}

}
