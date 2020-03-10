  package com.flightreservation.model.services;

import java.util.List;

import com.flightreservation.model.domain.FlightInformation;
import com.flightreservation.model.services.exception.FlightException;

public interface IFlightService  extends IService{
	
	public final String NAME = "IFlightService";
	
	void createFlight(FlightInformation flightInformation) throws FlightException;
	FlightInformation getFlight() throws FlightException;
	

}
