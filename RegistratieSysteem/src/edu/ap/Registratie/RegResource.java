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
		String naampati�nt= newReg.getString("naampati�nt"); 
		String geboortedatumpati�nt = newReg.getString("geboortedatumpati�nt");
	    String naamverpleegkundige = newReg.getString("naamverpleegkundige ");
	    String diagnose = newReg.getString("diagnose");

		
		jdbc c = jdbc.getJDBConnection();
		c.openConnection("Register", "root", "");
		c.executeInsert("Register",  Naam, naampati�nt,geboortedatumpati�nt,naamverpleegkundige,diagnose);
		c.closeConnection();
		
	}}
