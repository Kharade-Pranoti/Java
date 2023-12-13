// A program to check even or odd integers

import java.io.*;
import java.util.*;

class EvenOdd {
	public static void main (String[] args) {
	    int number ;
	    
	    System.out.println("Enter a value :");
    
	    Scanner sc = new Scanner(System.in);  
	    number = sc.nextInt();
	    
	    if(number % 2 == 0)
	    {
	        System.out.println("Even");
	    }
	    else{
	        System.out.println("Odd");
	    }
	}
}
