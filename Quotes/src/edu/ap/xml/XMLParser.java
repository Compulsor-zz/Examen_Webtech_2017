package edu.ap.xml;

import org.w3c.dom.*;

import javax.swing.JOptionPane;
import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.InputSource;

import java.io.*;

public class XMLParser {

	private String INPUTFILE = "/Users/schel/desktop/oscar_wilde.txt";

	/**
	 * Get all races from the xml file and return them in html format
	 */
	public String getQuotes() {
		File inputFile = new File(INPUTFILE);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;

		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			String result = "<h2>Races</h2>";

			NodeList races = doc.getElementsByTagName("race");

			for (int i = 0; i < races.getLength(); i++) {
				Node nNode = races.item(i);
				Element eElement = (Element) nNode;

				result += "<br/><b>Name : </b>" + eElement.getAttribute("name");
				result += "<br/><b>Date : </b>" + eElement.getAttribute("date");
				result += "<br/><b>Distance : </b>" + eElement.getAttribute("distance");
				result += "<br/>";
			}

			return result;
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}