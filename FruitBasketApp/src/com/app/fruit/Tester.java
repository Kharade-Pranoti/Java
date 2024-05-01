package com.app.fruit;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the basket: ");
		int basketSize = sc.nextInt();
		
		Fruit f = new Apple();
		Fruit basket[] = new Fruit[basketSize];	// array of references
		int choice;
		
		int counter = 0;
		
		do {
			System.out.println("1. Add Apple \n2. Add Mango \n3. Add Orange"
					+ " \n4. Display all names of fruits from the basket."
					+ "\n5. Display details of the fruits from the basket" + 
					"\n6. Specific functionality of fruit \n7. Exit");
			choice = sc.nextInt();
			
		switch(choice) {
		case 1:
			basket[counter] = new Apple("Red", 45.63, "Kashmiri apple", true);
			counter++;
			System.out.println("Apple is added.");
			if(basketSize <= counter) {
				System.out.println("Basket is full");
			}
			break;
		
		case 2:
			basket[counter] = new Mango("Yellow", 28.63, "Kesari Mango", true);
			counter++;
			System.out.println("Mango is added.");
			if(basketSize <= counter) {
				System.out.println("Basket is full");
			}
			break;
			
		case 3:
			basket[counter] = new Orange("Orange", 72.00, "orange", true);
			counter++;
			System.out.println("Orange is added.");
			if(basketSize <= counter) {
				System.out.println("Basket is full");
			}
			break;
			
		case 4:
			FruitUtilityClass.displayNamesOfFruitsFromBasket(basket);
			break;
			
		case 5:
			FruitUtilityClass.displayFruitsDetailsFromBasket(basket);
			break;
			
		case 6:
			// taking index of the fruit basket array
			System.out.println("Enter the index number of basket: ");
			int index = sc.nextInt();
			
			// check if at the entered index location apple is there 
			// if yes then downcast. Access and print the functionality of apple i.e. jam()
				// work in progress
				
					if(f instanceof Apple) {
						((Apple)f).jam();
					}
				
				
					if(f instanceof Mango) {
						((Mango)f).pulp();
					}
				
				 if(basket[index].getName() == "orange") {
					//f.pulp(); // error
						
					// downcasting from Fruit to Mango
					if(f instanceof Orange) {
						((Orange)f).juice();
					}
				}
				else {
					System.out.println("Enter valid index.");
				}
				
				break;
				
				}
			
			
		}while(choice != 7);
		

	}

}
