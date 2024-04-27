package com.app.fruit;

public abstract class Fruit {
	
	// properties of fruit
	private String color;
	private double weight;
	private String name;
	private boolean fresh = true;

	//default constructor
	Fruit(){
		
	}

	// parametrized constructor
	Fruit(String color, double weight, String name, boolean fresh){
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.fresh = fresh;
	}
	
	// getters and setters
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	
	public boolean getFresh() {
		return fresh;
	}
	
	// general taste of fruit
	public String taste() {
		return "no specific taste";
	}
	
	// toString method
	@Override
	public String toString() {
		return "Name :" + name + " Color:" + color + " Weight:" + weight;
	}
	
}
