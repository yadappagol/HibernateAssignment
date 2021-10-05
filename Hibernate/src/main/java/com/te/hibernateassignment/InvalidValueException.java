package com.te.hibernateassignment;

public class InvalidValueException extends RuntimeException {

	String msg;

	public InvalidValueException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return this.msg;
	}
	
}
