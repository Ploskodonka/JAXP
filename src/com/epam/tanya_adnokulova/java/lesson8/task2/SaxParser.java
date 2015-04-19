package com.epam.tanya_adnokulova.java.lesson8.task2;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SaxParser {
	public void saxReader() throws IOException, SAXException, ParserConfigurationException {
		SAXParserFactory spf = SAXParserFactory.newInstance();
		SAXParser parser = spf.newSAXParser();
		SAXHandler handler = new SAXHandler();
		parser.parse("X-mas_gift.xml", handler);
		List<Candy> candylist = handler.getCandylist();
		
		for (int i = 0; i < candylist.size(); i++) {
			System.out.println(candylist.get(i));
		}
	}
}
