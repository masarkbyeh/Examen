package edu.ap.Registratie;
import org.restlet.*;
import org.restlet.data.Protocol;

public class RegServer {

	public static void main (String[] args){
		try{
			
			//maak een nieuw component 
			Component comp = new Component(); 
			//voeg een nieuw HTTP server lising on port8080
			comp.getServers().add(Protocol.HTTP, 8080);
			//hier voeg de sample applicatie 
			comp.getDefaultHost().attach("/register", new RegApplication());
			comp.start();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
				
		}
			
	}

	

}
