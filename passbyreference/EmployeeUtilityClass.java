package com.passbyreference;

import java.util.Scanner;

public class EmployeeUtilityClass {
	
	
	// function to accept the details of an employee
	public static void acceptDetailsOfEmployee(Employee arr[]) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			
		
		System.out.println("Enter the employee's id : ");
		int empid = sc.nextInt();
		
		System.out.println("Enter the employee's name : ");
		String empname = sc.next();
		
		System.out.println("Enter the employee's salary : ");
		float salary = sc.nextFloat();
		
		System.out.println("Enter the employee's organization name : ");
		String orgName = sc.next();
		
		arr[i] = new Employee(empid, empname, salary, orgName);
		
		}
		
	}
	
	public static void displayDetailsOfEmployee(Employee arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void editOrganizationName(Employee arr[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the empid for which you want to change the name");
		int id = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i].getEmpid() == id) {
				
				System.out.println("Enter the org name");
				String name = sc.next();
				
				arr[i].setOrgName(name);
			}
		}
	}

	
}
