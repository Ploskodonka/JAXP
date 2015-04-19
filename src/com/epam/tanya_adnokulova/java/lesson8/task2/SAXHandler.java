package com.epam.tanya_adnokulova.java.lesson8.task2;


import java.util.ArrayList;
import java.util.List;
import java.lang.String;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;


public class SAXHandler extends DefaultHandler {
	String currentElement;
	List<Candy> candylist = new ArrayList<Candy>();
	String name;
	double energy;
	String type;
	List<Ingredients> ingredientList = new ArrayList<Ingredients>();
	List<Value> valueList = new ArrayList<Value>();
	String production;
	
	public void startDocument () throws SAXException {
		System.out.println("parsing is started...");
	}
	
	public void endDocument() throws SAXException {
		System.out.println("parsing is ended...");
	}

	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		boolean flag = false;
		if (qName.equals("sweet")) {
			name = attributes.getValue("name");
			energy = Double.valueOf(attributes.getValue("energy"));
			type = attributes.getValue("type");
			production = attributes.getValue("production");			
		}
		
		if (qName.equals("ingredients")) {
			ingredientList = getIngredients(uri, localName, qName, attributes);
		}
		
		if (qName.equals("value")) {
			valueList = getValue(uri, localName, qName, attributes);
			flag = true;
		}
		
		if (flag) {
			candylist.add(new Candy(name, energy, type, ingredientList, valueList, production));
		}
	}
	
	private List<Ingredients> getIngredients(String uri, String localName, String qName, Attributes attributes) {
		List<Ingredients> ingredientList = new ArrayList<Ingredients>();
		for (int i = 0; i < attributes.getLength(); i++) {
			ingredientList.add(new Ingredients(attributes.getQName(i), Double.valueOf(attributes.getValue(i))));
		}
		return ingredientList;
	}
	
	private List<Value> getValue(String uri, String localName, String qName, Attributes attributes) {
		List<Value> valueList = new ArrayList<Value>();
		for (int i = 0; i < attributes.getLength(); i++) {
			valueList.add(new Value(attributes.getQName(i), Double.valueOf(attributes.getValue(i))));
		}
		return valueList;
	}
	
	public List<Candy> getCandylist() {
		return candylist;
	}
}
