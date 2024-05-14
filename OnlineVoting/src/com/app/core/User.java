package com.app.core;

import java.sql.Date;

public class User {
	// state
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private boolean status;
	private Date birthDate;
	private String role;
	
	// parametrized ctor
	public User(int userId, String firstName, String lastName, String email, String password, boolean status,
			Date birthDate, String role) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.status = status;
		this.birthDate = birthDate;
		this.role = role;
	}
	
	// para ctor for userid, first and last name, email, password, status, birthdate, role
	public User( String firstname, String lastname, String email, String password,
			 Date birthdate) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.email = email;
		this.password = password;
		this.birthDate = birthdate;
		
	}
	
	// para ctor for firstname and lastname
	public User(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
	}
	
	// para ctor to show user details according to the begin and end date
	public User(int userId, String firstName, String lastName, String email, boolean status,
			Date birthDate, String role) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.status = status;
		this.birthDate = birthDate;
		this.role = role;
	}

	// getters and setters
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	// toString()
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", status=" + status + ", birthDate=" + birthDate + ", role=" + role + "]";
	}

	
	

}
