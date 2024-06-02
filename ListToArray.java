import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Write a program to convert List to ArrayList
// example - from arraylist or linkedlist to an Array

public class ListToArray {

	public static void main(String[] args) {
		// empty arraylist
		List<Integer> list = new ArrayList<Integer>();
		
		// adding elements into the arraylist
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		// 1. By using toArray() method
		
		// converting a List(ArrayList) to an array
		// finding out the size of the list creating an array of the size 
		// of the list and converting it into an array
		
		Integer array[] = list.toArray(new Integer[list.size()]);

		// print the array
		for(int arr: array) {
			System.out.println(arr);
		}
		
		// 2. By using get() method
//		Integer arr[] = new Integer[list.size()];
//		
//		for(int i=0; i<list.size(); i++) {
//			arr[i] = list.get(i);
//		}
//		
//		// print the array
//		for(int num : arr) {
//			System.out.println(num);
//		}
		
	}

}
