package edu.ap.Registratie;
import org.restlet.resource.ServerResource;
import org.restlet.resource.Post;
import org.json.JSONObject;
import edu.ap.jdbc.jdbc;



public class RegResource extends ServerResource {
			
			
@Post("txt")
	
	public void newProduct(String json){
		JSONObject newReg = new JSONObject(json);
		String Naam = newReg.getString("datum");
		String naampatiŽnt= newReg.getString("naampatiŽnt"); 
		String geboortedatumpatiŽnt = newReg.getString("geboortedatumpatiŽnt");
	    String naamverpleegkundige = newReg.getString("naamverpleegkundige ");
	    String diagnose = newReg.getString("diagnose");

		
		jdbc c = jdbc.getJDBConnection();
		c.openConnection("Register", "root", "");
		c.executeInsert("Register",  Naam, naampatiŽnt,geboortedatumpatiŽnt,naamverpleegkundige,diagnose);
		c.closeConnection();
		
	}}
