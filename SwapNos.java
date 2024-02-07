// WAP to swap two numbers without using third variable in java
class SwapNOs {
    public static void main(String[] args) {
        int a = 45;
        int b = 67;
        
        System.out.println("Before Swapping : ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        // storing the sum of b and a in b variable
        b = b + a;
        a = b - a;  // a is swapped
        b = b - a;  // b is swapped
        
        System.out.println("After swapping : ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
