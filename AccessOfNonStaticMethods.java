// To demonstrate that the non-static methods and non-static variables are accessed
// by the static methods.

public class AccessOfNonStaticMethods {
	int a = 10;	// non-static variable
	
	//non-static method
	void display() {
		System.out.println(a);
	}
	
	// static method
	static void print() {
		System.out.println(a); // cannot access non-static variable
		display(); // cannot access non-static method
	}
	
}
