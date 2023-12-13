// Write a program that read 5 numbers from user. Number between 5 and 10 are not valid. Print the product of these numbers.

import java.util.*;

public class Continue_stmt 
{
  public static void main(String args [])
  {
    double num, count = 1, product = 1;

    // creating a scanner object
    Scanner sc = new Scanner(System.in) ;

    // condition for taking only five user inputs
    while(count <= 5){
      System.out.println("Enter a valid number");
      num = sc.nextInt();
      
      // check if the num is not in between 5 and 10
      if(num >= 5 && num <= 10){
        System.out.println("Invalid number..");
        continue;  // continue statement will take control to while condition
      }

      // calculating the product of the numbers entered by the user (the numbers which are not in between 5 and 10
      product = product * num;
      ++count;
    }  // end of while loop

    // Print the result of the product
    System.out.println("Product = "+product);
      
    
  }
}
