package edu.ap.oscar;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import edu.ap.xml.XMLParser;
import org.restlet.resource.ServerResource;

public class OscarResource extends ServerResource{
	
	
	@Get("html")
	public String getRace() {
		
		XMLParser parser = new XMLParser();
		return parser.toString();
	}
	
	@Post("txt")
	public String addRunner(String runner) {
		XMLParser parser = new XMLParser();
		return parser.toString();
	}

}
