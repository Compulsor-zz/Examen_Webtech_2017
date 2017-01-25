package edu.ap.webtech;

import java.util.ArrayList;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import edu.ap.xml.XMLParser;

public class HospitalResource extends ServerResource {

	
	@Get("html")
	public String getPatients() {
		XMLParser parser = new XMLParser();
		return parser.getPatients();
	}
	
	@Post("txt")
	public String addPatient(String xml) {
		XMLParser parser = new XMLParser();
		return parser.addPatient(xml);
	}
}