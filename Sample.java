// Sample program for initializer block

public class Sample {
	
	// initializer block starts
	{
		System.out.println("Initializer block executed.");
	}
	// initializer block ends
	
	Sample(){
		System.out.println("Default constructor invoked.");
	}

	Sample(int x){
		System.out.println("Parametrized constructor invoked.");
	}
	
	public static void main(String args[]) {
		Sample s = new Sample();
		Sample s1 = new Sample(10);
	}
}
