// Java Program to swap two numbers

import java.util.Scanner;

public class SwappingNumbers 
{
  public static void main(String args[])
  {
    int no1, no2;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter first number :");
    no1 = sc.nextInt();

    System.out.println("Enter second number :");
    no2 = sc.nextInt();

    System.out.println("Before Swapping : ");

    int temp;

    // swapping two numbers
    temp = no1;
    no1 = no2;
    no2 = temp;

    System.out.println("\nAfter Swapping : ");
    System.out.println("no1 = " +no1 + " no2 = " +no2);
    
  }
}
