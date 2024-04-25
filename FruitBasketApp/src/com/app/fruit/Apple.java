package com.app.fruit;

public class Apple extends Fruit{
	
	Apple(){
		
	}
	
	Apple(String color, double weight, String name, boolean fresh){
		super(color, weight, name, fresh);
	}
	
	// overriding taste()
	public String taste() {
		return "sweet and sour";
	}
	
	// speciality of apple fruit
	public void jam() {
		System.out.println("making jam");
		
	}
	

	@Override
	public String toString() {
		return  super.toString();
	}
}
