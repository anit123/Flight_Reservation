package com.flightreservation.model.business.exception;

public class PropertyFileNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PropertyFileNotFoundException(final String message, final Throwable nestedMessage) {
		super(message, nestedMessage);
	}

}
