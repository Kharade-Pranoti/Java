package com.app.fruit;

public class Orange extends Fruit{

	Orange(String color, double weight, String name, boolean fresh){
		super(color, weight, name, fresh);
	}

	public String taste() {
		return "sour";
	}
	
	// speciality of apple fruit
	public void juice() {
		System.out.println("Exctracting juice");
		
	}
	
	@Override
	public String toString() {
		return  super.toString();
	}
}
