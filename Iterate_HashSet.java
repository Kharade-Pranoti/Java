import java.util.HashSet;
import java.util.Iterator;

// Write a program to iterate or traverse a hashset

public class Iterate_HashSet {

	public static void main(String[] args) {
		// declaring hashet of string
		HashSet<String> hashset = new HashSet();
		
		// add the elements into the hashset
		hashset.add("Black");
		hashset.add("blue");
		hashset.add("pink");
		hashset.add("yellow");
		hashset.add("violet");
		
		// We can iterate HashSet by using iterator or for-each loop
		
		// 1. By using iterator
		Iterator<String> itr = hashset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		// 2. By using for-each loop
		for(String str : hashset) {
			System.out.println(str.toString());
		}
	}

}
