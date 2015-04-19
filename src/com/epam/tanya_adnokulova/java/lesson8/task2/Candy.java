package com.epam.tanya_adnokulova.java.lesson8.task2;

import java.util.ArrayList;
import java.util.List;

public class Candy {
	private String name;
	private double energy;
	private String type;
	private List<Ingredients> ingredients = new ArrayList<Ingredients>();
	private List<Value> value = new ArrayList<Value>();
	private String production;
	
	public Candy(String name, double energy, String type, List<Ingredients> ingredients, List<Value> value, String production) {
		this.name = name;
		this.energy = energy;
		this.type = type;
		this.ingredients = ingredients;
		this.value = value;
		this.production = production;
	}

	public String toString() {
		return "\nCandy name: " + name + "\nEnergy: " + energy + " kkal" + "\nType: " + type + "\nProduction: " 
				+ production + "\nIngredients: " + ingredients.toString() + "\nValue: " + value.toString();
	}

	
}
