package com.epam.tanya_adnokulova.java.lesson8.task1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Analyzer {
	public static List<Candy> candyBuilder (Element root) throws SAXException, IOException {
		List<Candy> candylist = new ArrayList<Candy>();
		List<Ingredients> ingredientList = new ArrayList<Ingredients>();
		List<Value> valueList = new ArrayList<Value>();
		NodeList candyNode = root.getElementsByTagName("sweet");
		
		for (int i = 0; i < candyNode.getLength(); i++) {
			Element candyElement = (Element) candyNode.item(i);
			String name = candyElement.getAttribute("name");
			double energy = (Double.valueOf(candyElement.getAttribute("energy")));
			String type = candyElement.getAttribute("type");
			String production = candyElement.getAttribute("production");
			ingredientList = getIngredients(candyElement);
			valueList = getValues(candyElement);
			candylist.add(new Candy(name, energy, type, ingredientList, valueList, production));
		}		
		return candylist;
	}
	
	private static List<Ingredients> getIngredients(Element candyElement){
		List<Ingredients> ingredientList = new ArrayList<Ingredients>();
		Element ingredients = ((Element) candyElement.getElementsByTagName("ingredients").item(0));
		NamedNodeMap ingredientNode = ingredients.getAttributes();
		
		for (int i = 0; i < ingredientNode.getLength(); i++) {
			Attr attr = (Attr) ingredientNode.item(i);
			ingredientList.add(new Ingredients(attr.getNodeName(), Double.valueOf(attr.getNodeValue())));
		}
		return ingredientList;		
	}

	private static List<Value> getValues(Element candyElement){
		List<Value> valueList = new ArrayList<Value>();
		Element values =((Element) candyElement.getElementsByTagName("value").item(0));
		NamedNodeMap valueNode = values.getAttributes();
		
		for (int i = 0; i < valueNode.getLength(); i++) {
			Attr attr = (Attr) valueNode.item(i);
			valueList.add(new Value(attr.getNodeName(), Double.valueOf(attr.getNodeValue())));
		}
		return valueList;		
	}
}
