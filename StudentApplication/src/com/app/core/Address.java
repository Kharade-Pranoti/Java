package com.app.core;

public class Address {
	// data members
	String city, state, cellno;

	// parametrized constructor
	public Address(String city, String state, String cellno) {
		super();
		this.city = city;
		this.state = state;
		this.cellno = cellno;
	}

	// getters for all the data members
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}


	public String getCellno() {
		return cellno;
	}

	
	// overriding toString
	@Override
	public String toString() {
		return "Address [City: " + city + " State: " + state + " Cell No: " + cellno + "]" ;
	}
	
}
