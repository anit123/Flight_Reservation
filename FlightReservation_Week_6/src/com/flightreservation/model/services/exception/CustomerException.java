package com.flightreservation.model.services.exception;

public class CustomerException extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	public CustomerException() {
		
	}
	
	public CustomerException(String arg1) {
		super(arg1);
	}

	public CustomerException(String arg1, Throwable arg2) {
		super(arg1, arg2);
	}
	
	
}
