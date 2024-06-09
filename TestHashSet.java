package com.test;

import java.util.*;

public class TestHashSet {

	public static void main(String[] args) {
		
		String[] strings = {"one", "two", "three", "four", "five", "six", "two",
				"three", "eight"};
		
		// create empty hashset to store the strings and populate it from array
		Set<String> stringSet = new HashSet();

// add the data into the hashset
		for(String s : strings) {
			System.out.println("Added "+ stringSet.add(s));
		}

// display the size of the hashset
		System.out.println("Size = "+stringSet.size());
		System.out.println(stringSet);
		
		// we can iterate set via for-each or Iterator
		// remove the element from set which starts with 'f'
		Iterator<String> itr = stringSet.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			if(s.startsWith("f")) {
				itr.remove();
			}
		}
		
		System.out.println("After removing an element");
		System.out.println(stringSet);
		
		}

	}


