public class IntegerList {

	public static void main(String[] args) {
		// create empty arraylist  of integer
		// size : 0 and capacity : 10
		ArrayList<Integer> intList = new ArrayList();
		System.out.println("Arraylist contents");
		
		// populate the arraylist from the data array
		int[] data = {10, 20, 30 ,40, 50};
		for(int i: data)
			intList.add(i); // autoboxing
		// int to Integer
		
		// print the elements from the arraylist via toString()
		System.out.println("Arraylist: "+intList);
		
		// print the elements from arraylist via for-each loop
//		for(int i: intList)
//			System.out.println(i);
		
		// print the elements from arraylist via iterator
		Iterator<Integer> itr = intList.iterator();
		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		// print the elements from arraylist via for loop
		// if we don't access elem by using get() it gives us C.E
//		for(int i=0; i<intList.size(); i++) {
//			System.out.println(intList.get(intList.size()));
//		}
		// IndexOutOfBoundException - intList.size() gives 5 whereas the index start from
		// 0 to 4
		
		// to check elements consists in arraylist or not
		System.out.println(intList.contains(10)?"Present" : "Absent");
		
		// to replace 3rd element by it's double value
		System.out.println("Replaced "+ intList.set(3, intList.get(3)*2));
		System.out.println(intList);
		
		// print index of 1st occurrence of 10 and last occurrence
		// to find in 1st occur--> indexOf()
		// to find at last occur --> lastIndexOf()
		System.out.println(intList.indexOf(10) + "..." +  intList.lastIndexOf(10));
		
		// to remove the last element
		System.out.println("Removed : "+ intList.remove(intList.size()-1));
		System.out.println(intList);
		
		// sorted list
		Collections.sort(intList);
		System.out.println("sorted list");
		System.out.println(intList);
	}

}
