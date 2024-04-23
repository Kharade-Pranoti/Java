package com.passbyreference;

public class Employee {
	private int empid;
	private String name;
	private float salary;
	private String organizationName;
	
	// parametrized constructor
	Employee(int empid, String name, float salary, String organizationName){
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.organizationName = organizationName;
	}
	
	// getters and setters methods to access the private data members of the class
	
	// getter and setter to get and set the value of employee id
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public int getEmpid() {
		return empid;
	}
	
	
	// getter and setter to get and set the value of employee name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// getter and setter to get and set the value of employee's salary
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public float getSalary() {
		return salary;
	}

	// getter and setter to get and set the value of a organization name
	public void setOrgName(String newOrganizationName) {
		this.organizationName = newOrganizationName;
	}
	
	public String getOrgName() {
		return organizationName;
	}
	
	// overriding toString() for string representation of an object
	@Override
	public String toString() {
		return "Employee - Id = "+empid+ " Name = "+ name + " Salary = " + salary +
				" OrganizationName = "+ organizationName;
	}
	
}
