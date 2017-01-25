package edu.ap.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;

import com.sun.xml.internal.txw2.Document;

public class XMLParser {
	
	
	
	File file = new File("C:/Users/Meso/Documents/AP/Web3_/Examen/oscar_wilde.txt");
	
	
//een opvraging van alle quotes
   public String getOscar(){
		
		try (FileInputStream fis = new FileInputStream(file)){

			int content;
			while ((content = fis.read()) != -1) {
				// convert to char and display it
				System.out.print((char) content);
			}} catch (IOException e) {
				e.printStackTrace();
			}	
		
		return content;
		
	}
		
   //een opvraging per zoekwoord waarbij de quotes het woord bevatten
   
   
public String getKeyword(){
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	//Document doc = factory.newDocumentBuilder().parse(new File(file));
	
	
	
	
	
}
	
	
	
	
	//een opvraging van alle quotes
	
	
	

}
