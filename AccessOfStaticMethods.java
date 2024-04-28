// To demonstrate that in both static and non-static methods, the static methods
// are directly accessed.

public class AccessOfStaticMethods {
	static int num = 100;
	static String str = "Helloo";
	
	// static method to display static variable's values
	static void display() {
		System.out.println("The static number is : "+num);
		System.out.println("The static string is : "+str);
	}
	
	// non-static method
	void nonStaticMethod() {
		System.out.println("Accessing the static method from non-static method.");
		display();
	}
	
	// static method
	static void staticMethod() {
		System.out.println("Accessing the static method from static method -");
		display();
	}
	
	public static void main(String args []) {
		// creating an instance of the class
		AccessOfStaticMethods method = new AccessOfStaticMethods();
		
		// calling display method -- static method
		display();
		
		// calling non-static method
		method.nonStaticMethod();
		
		staticMethod();
	}

}
