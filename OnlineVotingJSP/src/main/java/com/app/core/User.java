package com.app.core;

import java.sql.Date;

public class User {
	private int voterId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date dob;
	private boolean status;
	private String role;
	
	// default constructor
	public User() {
		
	}
	
	// parametrized constructor
	public User(int voterId, String firstName, String lastName, String email, String password, Date dob, boolean status,
			String role) {
		super();
		this.voterId = voterId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}


	// parametrized constructor
	public User(String firstName, String lastName, 
			String email, String password, Date dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.role="voter";
	}
	
	// getters and setters
	public int getVoterId() {
		return voterId;
	}
	
	public void setVoterId(int userId) {
		this.voterId = voterId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	// overriding toString()
	@Override
	public String toString() {
		return "User [VoterId=" + voterId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", dob=" + dob + ", status=" + status + ", role=" + role + "]";
	}

}


}
