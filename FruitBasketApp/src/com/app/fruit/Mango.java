package com.app.fruit;

public class Mango extends Fruit {
	
	Mango(String color, double weight, String name, boolean fresh){
		super(color, weight, name, fresh);
	}

	public String taste() {
		return "sweet";
	}
	
	// speciality of apple fruit
	public void pulp() {
		System.out.println("Creating pulp");
		
	}
	
	@Override
	public String toString() {
		return  super.toString();
	}
}
