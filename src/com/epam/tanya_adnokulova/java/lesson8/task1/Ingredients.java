package com.epam.tanya_adnokulova.java.lesson8.task1;

public class Ingredients {
	final String name;
	final double quantity;
	
	public Ingredients (String name, double quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public String toString() {
		return name + " " + quantity + " mg";
	}
}