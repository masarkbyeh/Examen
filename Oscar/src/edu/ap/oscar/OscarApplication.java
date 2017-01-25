package edu.ap.oscar;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class OscarApplication extends Application {
	  public synchronized Restlet createInboundRoot() {

	       Router router = new Router(getContext());

	      router.attach("/oscar", OscarResource.class);
	    

	       return router;
	   }

}
