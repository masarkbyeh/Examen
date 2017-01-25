package edu.ap.Registratie;
import org.json.JSONArray;
import org.json.JSONObject;

import org.restlet.resource.ClientResource;


public class RegClient {
	
	public static void main (String[] args){
		
		//creet een client resource 
				ClientResource client = new ClientResource("http://127.0.0.1:8181/Rigster/register");
	
				//Post a new Record 
				
				JSONObject json = new JSONObject(); 
				json.put("datum","25/01/2016");
				json.put("naampatiënt", "Masar");
				json.put("geboortedatumpatiënt", "03/05/2016");
				json.put("naamverpleegkundige", "Saena");
				json.put("diagnose", "Koorts");

				client.post(json.toString()); 
				
				//schrijf de entity antwoord op de console 
				try{
				client.get().write(System.out);
				System.out.println();
			
				JSONObject obj1 = new JSONObject(client.get(String.class));
				JSONArray array1 = obj1.getJSONArray("client");
				for(int i = 0 ; i < array1.length(); i++){
					
					JSONObject obj2 = array1.getJSONObject(i);
					System.out.println(obj2.toString());
					
				}}
				
				catch (Exception e) {
		            
					  System.out.println("In main : " + e.getMessage());

					            }
					        }

	

	}


