package edu.ap.oscar;
import org.restlet.resource.ClientResource;

public class OscarClient {
	
	 public static void main(String[] args) {
         
         try {
        	ClientResource resource = new ClientResource("http://localhost:8080/Oscares");
        	// Post a new race
        	String oscar = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
        	
    		resource.post(oscar);
    		// get the response
        	System.out.println(resource.getResponseEntity().getText());
        }
        catch (Exception e) {
            System.out.println("In main : " + e.getMessage());
        }
    }

}
