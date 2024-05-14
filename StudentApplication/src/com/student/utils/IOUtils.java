package com.student.utils;

import java.util.stream.Stream;
import com.app.core.*;
import java.io.*;

public interface IOUtils {

	// static method to store the student details in buffered manner into the text file.
	static void storeDetails(Stream<Student> studentStream, String filename) {
		System.out.println("Inside the storeDetails function");
		
		//creating the instance of the PrintWriter : buffered
		// creating the instance of the FileWriter : unbuffered and passing the filename to it.
		
		try(PrintWriter pw = new PrintWriter(new FileWriter(filename))){
			System.out.println("Inside the try with resources block of storeDetails");
			
			// iterating the studentStream and writing the data char by char in a text file.
			studentStream.forEach(s -> pw.println(s));
			
			System.out.println("Data is written in the file");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
