package com.app.fruit;

public class FruitUtilityClass {

	public static void displayFruitsDetailsFromBasket(Fruit basket[]) {
		for(int i=0; i<basket.length; i++) {
			System.out.println(basket[i]);
		}
	}
	
	public static void displayNamesOfFruitsFromBasket(Fruit basket[]) {
		for(int i=0; i<basket.length; i++) {
			System.out.println(basket[i].getName());
		}
	}
	
	
}
