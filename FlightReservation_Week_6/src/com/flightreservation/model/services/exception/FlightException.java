package com.flightreservation.model.services.exception;

public class FlightException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public FlightException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }

}
