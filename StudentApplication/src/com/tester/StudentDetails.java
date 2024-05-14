package com.tester;

import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.Map;
import com.app.core.*;
import static com.student.utils.StudentUtils.*;
import static com.student.utils.IOUtils.storeDetails;;

public class StudentDetails {

	public static void main(String[] args) {
		
		// Suppose we have student details in a map. Can you store these details stored as per name 
		// in a text file in a buffered manner ?
		
		try(Scanner sc = new Scanner(System.in)){
			// trying to work with map structure using stream
			
			// getting the populated map from the StudentUtils
			Map<String, Student> map = populateMap(populateList());
			
			// sort the student details as per name
			// first converting the map into the collection type bcoz map doesn't have stream
			// then convert the collection into the stream and then applying the sorted() of Stream interface
			// using custom ordering as the sorting based is on name - value based
			// and then storing the data in a text file in a buffered manner.
			
			// functional literal for the comparator
			Comparator<Student> nameComparator = (s1, s2) -> s1.getName().compareTo(s2.getName());

			// values() converts the Map into the collection type
			Stream<Student> students = map.values()
			.stream()
			.sorted(nameComparator);
			//.forEach(i -> System.out.println(i + " "));
			System.out.println("The sorting of data as per name is completed.");
			
			System.out.println("Enter the file name in which you want to store the data:");
			storeDetails(students, sc.nextLine());
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Main over");
		

	}

}
