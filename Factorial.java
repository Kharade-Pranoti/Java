// A program to find the factorial of a number
import java.util.*;

public class Factorial{
  public static void main(String args []){
    int n;
    int fact = 1;
    
    System.out.println("Enter any number to find it's factorial.");

    // taking user input
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    for(int i = 1; i < n; i++){
      fact = fact * i;
    }

    System.out.println("Factorial is : " +fact);
  }
}
