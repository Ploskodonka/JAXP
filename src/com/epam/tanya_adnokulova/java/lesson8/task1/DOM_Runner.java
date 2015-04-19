package com.epam.tanya_adnokulova.java.lesson8.task1;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

/**
 * 
 * @author Tanya Adnokulova
 * lesson 8 task 1
 *
 */

public class DOM_Runner {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DomParser run = new DomParser();
		run.domReader();
	}
}
