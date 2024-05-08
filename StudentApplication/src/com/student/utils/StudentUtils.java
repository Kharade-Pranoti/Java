package com.student.utils;

import static java.time.LocalDate.parse;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import com.app.core.Student;
import com.app.core.Address;
import static com.app.core.Subject.JAVA;
import static com.app.core.Subject.REACTJS;
import static com.app.core.Subject.DATABASE;
import static com.app.core.Subject.ANGULAR;
import static com.app.core.Subject.CPP;

public class StudentUtils {

	public static int index;
	// a static method to store the hard coded values/data of the student in the list
	public static List<Student> populateList(){
		List<Student> students = new ArrayList<>(
				Arrays.asList(new Student("dac-01", "ravi", parse("1999-12-13"), ANGULAR, 3.2),
						new Student("ditiss-09", "riya", parse("1998-12-13"), REACTJS, 6.9),
						new Student("dac-24", "shekhar", parse("1997-12-13"), DATABASE, 5.9),
						new Student("dbda-42", "priya", parse("1999-02-23"), JAVA, 4.7),
						new Student("dbda-107", "kiran", parse("1996-02-13"), CPP, 7.1),
						new Student("dac-3", "meeta", parse("1998-12-19"), DATABASE, 5.2),
						new Student("ditiss-58", "sameer", parse("1997-12-06"), JAVA, 8.2)));
		
		List<Address> address = Arrays.asList(new Address("pune", "MH", "452446"), new Address("pune", "MH", "652446"),
				new Address("nagpur", "MH", "852446"), new Address("indore", "MP", "752446"),
				new Address("mumbai", "MH", "672446"), new Address("pune", "MH", "692446"),
				new Address("chennai", "TN", "862446"));
		
		// to traverse the arraylist of student and to get the address from the list from specified position.
		// public int get(int index) - method in java.util.List
		// returns the element at the specified position in this list.
		students.forEach(s -> s.assignAddress(address.get(index++)));
		return students; // returns the populated list of students with address
		
	}
	
	// a static method to accept list of students and returns the populated map
	public static Map<String, Student> populateMap(List<Student> studentlist){
		// creating a empty hashmap
		HashMap<String, Student> hashmap = new HashMap<>();
		studentlist.forEach(stud -> hashmap.put(stud.getRollNo(), stud)); // put(k,v) : key:rollNo and value:student data
		// put() returns string that's why i think roll no doesn't accept int datatype
		return hashmap;
	}
	
}
