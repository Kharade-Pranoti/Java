package com.test;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// create empty linkedlist
		LinkedList<String> list = new LinkedList<>();
		
		Collections.addAll(list, "red", "yellow", "blue", "green", "white");
		System.out.println("Elements:");
		System.out.println(list);
		
		// to get the first element of the list
		System.out.println("First element: "+ list.getFirst());
		
		// to get the last element of the list
		System.out.println("Second element: "+ list.getLast());

    // peekFirst - gives first element without removing
    // peek - gives head element of the linkedlist (meaning first element)
    // peeklast - gives last element
		System.out.println("peek first: " + list.peekFirst());
		System.out.println("peek: " + list.peek());
		System.out.println("peek last: " + list.peekLast());
		
		System.out.println();

    // removeFirst - removes first element from linkedlist, returns the first element
    // removeLast - removes last element from linkedlist, returns the last element
		System.out.println("Removes first: "+ list.removeFirst());
		System.out.println("Removes last: "+ list.removeLast());

    // display the final list
		System.out.println(list);
	}

}
