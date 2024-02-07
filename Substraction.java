// A program to do substraction of two numbers
import java.util.Scanner;

public class Sub
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter first number");
      int a = sc.nextInt();

      System.out.println("Enter second number");
      int b = sc.nextInt();

      int sub = a - b;
      System.out.println("substraction = " + sub);
    }
  }
