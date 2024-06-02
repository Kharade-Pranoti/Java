package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

// given an element write a program to check if element(value) exists in arraylis

public class FindElementInArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		// add elements into the arraylist
		al.add(5);
		al.add(34);
		al.add(90);
		al.add(0);
		al.add(2);
		al.add(78);
		al.add(54);
		al.add(43);
		
		int element;
		System.out.println("Which element do you want to find?");
		
		if(al.contains(sc.nextInt())) {
			System.out.println("Element Found!!");
		}
		else {
			System.out.println("Element not Found!!");
		}

	}

}
