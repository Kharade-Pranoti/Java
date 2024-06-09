package com.test;

import java.util.*;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		String[] string = {"one","two","three","four","five","six","one","five"};
		
		// create empty linkedHashSet to store the strings and populate it from array
		Set<String> stringSet = new LinkedHashSet();
		
		// traverse the array and add the elements into the set
		for(String s: string) {
			stringSet.add(s);
		}
		
		// size of the set
		System.out.println("Size of HashSet : "+ stringSet.size());
		
		System.out.println("Set: "+ stringSet);
		
		// we traverse/iterate the LinkedHashSet through for-each or Iterator
		Iterator<String> str = stringSet.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
		}
	}

}
