// To demonstrate that the static method does not have access to the instance variable.

public class InstanceVar {

	// static variable
	static int a=40;
	
	// instance variable
	int b = 50;
	
	// display a and b value's
	void simpleDisplay() {
		System.out.println(a);
		System.out.println(b);
	}
	
	// declaration of static method
	static void display() {
		System.out.println(a); // static methods can access only static data members.
		// System.out.println(b);  // error - static methods cannot access instance variable
	}
	
	// main method
	public static void main(String args[]) {
		InstanceVar i = new InstanceVar();
		i.simpleDisplay();
		display(); // static methods can access directly without using objects also
	
	}
}
