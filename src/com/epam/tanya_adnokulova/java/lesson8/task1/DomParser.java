package com.epam.tanya_adnokulova.java.lesson8.task1;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;


public class DomParser {
	public void domReader() throws ParserConfigurationException, SAXException, IOException {
	
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse("X-mas_gift.xml");
			document.getDocumentElement().normalize();
			Element root = document.getDocumentElement();
			List<Candy> candylist = Analyzer.candyBuilder(root);
			
			for (int i = 0; i < candylist.size(); i++) {
				System.out.println(candylist.get(i));
			}
	}
}
