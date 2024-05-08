package com.app.core;

import java.time.LocalDate;

public class Student {
	private String rollNo;
	private String name;
	private LocalDate dob;
	private Subject subject;
	private double gpa;
	private Address address;
	
	// parametrized constructor
	public Student(String rollNo, String name, LocalDate dob, Subject subject, double gpa) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.subject = subject;
		this.gpa = gpa;
	}

	// Student class's override method
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dob=" + dob + ", subject=" + subject + ", gpa=" + gpa
				+ ", address=" + address + "]";
	}

	// only getter method for all data members
	public String getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public Subject getSubject() {
		return subject;
	}

	public double getGpa() {
		return gpa;
	}

	public Address getAddress() {
		return address;
	}
	
	// normal method to assign the address of a student
	public void assignAddress(Address a) {
		address = a;
	}
	
	
	
}
