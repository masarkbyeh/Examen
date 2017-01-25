package edu.ap.oscar;
import org.restlet.*;
import org.restlet.data.Protocol;

import edu.ap.oscar.OscarResource;


public class OscarServer {
	public static void main(String[] args) {
	try {
	
	    Component component = new Component();

	   
	    component.getServers().add(Protocol.HTTP, 8181);
	    
	    component.getDefaultHost().attach("/oscar", OscarResource.class);

		component.start();
	} 
    catch (Exception e) {
		System.out.println(e.getMessage());
	}
}

}
