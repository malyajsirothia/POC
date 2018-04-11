package com.cg.poc2;

public class InvalidLoginException extends Exception {
	
	String message;
	public InvalidLoginException(String message) {
		message = this.message;
	}

}
