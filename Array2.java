// Write a program to accept the size of an array from the user and also accept the array elements from the user and print it.

import java.util.Scanner;

public class Array {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int size;
		
		// getting the size of an array from the user
		System.out.println("Enter the size of an array:");
		size = sc.nextInt();
		
		int arr[];
		arr = new int[size];
		
		System.out.println("Enter the elements of an array : ");
		
		// to get the elements of an array from the user
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// to print the elements of an array
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
