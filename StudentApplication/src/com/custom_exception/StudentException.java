package com.custom_exception;

@SuppressWarnings("serial")
public class StudentException  extends Exception {

	StudentException(String message){
		super(message);
	}
}
