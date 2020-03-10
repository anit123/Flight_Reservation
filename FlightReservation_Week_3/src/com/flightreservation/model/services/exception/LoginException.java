package com.flightreservation.model.services.exception;

public class LoginException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LoginException(final String inMessage)
    {
        super(inMessage);
    }
	
	
	public LoginException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }

}
