// Write a program to accept the elements for two dimensional array and print the array elements

import java.util.Scanner;

public class Arrays {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[4][4];
		
		// getting the array elements from the user
		// outer loop is for row
		for(int i=0; i<4; i++) {
			// inner loop is for column
			for(int j=0; j<4; j++) {
				System.out.println("Enter the element");
				arr[i][j] = sc.nextInt();
			}
		}
		
		// printing the array elements of an array
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}
}
