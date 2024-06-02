import java.util.ArrayList;

// Write a program to traverse or iterate ArrayList

public class Iterate_Arraylist {

	public static void main(String[] args) {
		// empty arraylist
		ArrayList<Integer> al = new ArrayList();
		
		// adding the elements into the arraylist
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		// 1st way = iterating over an arraylist
		al.forEach(i -> System.out.print(i));
		
		// 2nd way 
//		for(Integer num : al) {
//			System.out.print(num + " ");
//		}
		

	}

}
