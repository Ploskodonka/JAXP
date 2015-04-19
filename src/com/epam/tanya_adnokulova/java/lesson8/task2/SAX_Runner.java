package com.epam.tanya_adnokulova.java.lesson8.task2;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

/**
 * 
 * @author Tanya Adnokulova
 * lesson 8 task 2
 *
 */

public class SAX_Runner {
	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
		SaxParser run = new SaxParser();
		run.saxReader();
	}
}
