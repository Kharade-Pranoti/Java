// To demonstrate how the static block is called in Java

public class StaticblockDemo1 {
	// static variable
	static int a;
	
	// non-static variable
	int b;
	
	static {
		a = 50;
		//b = 30; // static block cannot access non-static variable
		System.out.println("Static block is called");
	}
	
	public static void main(String args[]) {
		StaticblockDemo3 demo = new StaticblockDemo3();
		
		System.out.println(demo.a); // 50
		System.out.println(demo.b); // 0
		
	}
}

// static blocks initializes the static variable before any constructor is called.
// Static blocks are useful for setting up the class-level resources or performing one-time setup tasks.
