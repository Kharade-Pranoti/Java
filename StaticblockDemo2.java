// To demostrate that the static blocks are executed first at the time of class loading and before the instances of the class are created.
// We don't need to call the static blocks, they are called automatically.

public class StaticblockDemo2 {

	StaticblockDemo2(){
		System.out.println("It is a default constructor of the class.");
	}
	
	public static void print() {
		System.out.println("It is a static method of the class.");
	}
	
	static {
		System.out.println("It is a static block");
	}
	
	public static void main(String args[]) {
		StaticblockDemo2 s = new StaticblockDemo2();
		
		print();
	}
}
