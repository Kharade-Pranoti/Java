// A program to read a number and reverse that number.

import java.util.*;

public class ReverseNo {
	public static void main(String args [])
	{
		int num, rev=0 ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		num = sc.nextInt();
		
		int temp;
		
		// there is no need to give any initialization and increment/decrement so it is left blank
		for(; num != 0;)
		{
			temp = num % 10;        // it will give the last digit of a number (remainder)
			rev = rev * 10 + temp;	// to store the reverse number
			num = num/10;	          // it will remove the last digit (quotient)
		}
		
		System.out.println("The reverse number is : "+rev);
	}

}
