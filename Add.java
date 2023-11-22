// A program to add two numbers

import java.util.Scanner;

public class Addition
  {
    public static void main(String args[])
    {
      // taking user input
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the first number :");
      int a = sc.nextInt();

      System.out.println("Enter the second number :");
      int b = sc.nextInt();

      int add = a + b;
      System.out.println(a + " + " + b + " = " + add);
      
      
    }
  }
