package com.passbyreference;

import java.util.Scanner;

public class Client {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee emparr[] = new Employee[1];
		
		int choice;
		while(true) {
		System.out.println("Select an option");
		System.out.println("1. Enter the employee details. \n 2. Display the"
				+ "employee details. \n3.Edit the organization name");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
				EmployeeUtilityClass.acceptDetailsOfEmployee(emparr);
				break;
		case 2:
			    EmployeeUtilityClass.displayDetailsOfEmployee(emparr);
			    break;
			    
		case 3:
			EmployeeUtilityClass.editOrganizationName(emparr);
			break;
				
			    
		}
		
		}
	}
		

}
