// A program to find the armstrong number

import java.util.Scanner;

public class Armstrong {
	
	// the sum of cubes of all digits will be the same then it is armstrong no
  // ex --> 153 ==> (1*1*1) + (5*5*5) + (3*3*3) = 153 - armstrong number

	public static void main(String[] args) {
		long num, n, sum = 0;
		int rev;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = sc.nextLong();
		
		n = num;
		
		while(n != 0)
		{
			rev = (int) (n % 10);
			sum = sum + (rev*rev*rev);
			n = n/10;
		}
		
		if(num == sum)
		{
			System.out.println("Armstrong");
		}else {
			System.out.println("Not an Armstrong");
		}

	}

}
