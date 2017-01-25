package edu.ap.quotes;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class QuotesResource extends ServerResource {

	@Get
	public String allQuotes() throws FileNotFoundException, IOException {
		
		return null;
	}
	
}