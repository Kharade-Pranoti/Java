// To demostrate that how initializer block is used and executed.
// Initializer block is used whenever we want to perform some tasks while assigning the instance variable.
// Initializer block can be used in Constructor, Method or Block

public class Car {
	int speed;
	
	Car(){
		System.out.println("Speed of car: "+ speed); 
	}
	
	// initializer block
	{
		speed = 60; // first this block gets executed before the constructor is invoked and 60 value is assigned to the speed and then the constructor is called.
	}
	
	public static void main(String args[]) {
		Car obj = new Car(); 
	}
}
