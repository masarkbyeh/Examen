package edu.ap.jdbc;

import java.sql.* ;

import java.util.ArrayList;

public class jdbc {
	
	private static jdbc instance= null; 
	private Connection connection = null; 
	
	private jdbc(){}
	
	public void openConnection(String database , String user , String pwd){
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1/" + database;
			connection = DriverManager.getConnection(url, user , pwd); 
			
		}
		
		catch(Exception ex ){
			System.out.println("Error:" + ex);
		} } 

	public void closeConnection(){
		if(connection != null){
		try{
			connection.close();
		}
		
		catch(SQLException ex){
			System.out.println("Error" + ex );
		}
	}
	}
	
	
public static synchronized jdbc getJDBConnection(){
		
		if(instance == null ){
			instance = new jdbc(); 
		}
		
		return instance ; 
	}

public void executeInsert(String table , String datum , String naampatiënt, String geboortedatumpatiënt,String naamverpleegkundige , String diagnose){
	try{
		
		//wij maken Statement 
		Statement state = connection.createStatement();
		state.executeQuery( "INSERT INTO" + table + "VALUES ('"+datum+ "','" +  naampatiënt+ "','"+ geboortedatumpatiënt+"','"+  naamverpleegkundige+ "','"+ diagnose +")");
		state.close();			
		
	}
	
	catch(SQLException ex ){
		System.out.println("Error" + ex );
	}
}

	
	

}
