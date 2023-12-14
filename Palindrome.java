// A program to find whether a number is Palindrome or not

import java.util.*;

public class Palindrome {
	public static void main(String args [])
	{
		int num, rev=0 ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		num = sc.nextInt();
		
		int temp;
		int n = num;
		
		// there is no need to give any initialization and increment/decrement
		// so it is left blank
		for(; n != 0;)
		{
			temp = n % 10;  // it will give the last digit of a number (remainder)
			rev = rev * 10 + temp;	// to store the reverse number
			n = n/10;	// it will remove the last digit (quotient)
		}
		
		System.out.println("The reverse number is : "+rev);
		
		if(rev == num)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}

}
