package com.flightresercation.model.business.manager;



import org.junit.Test;

import com.flightreservation.model.business.manager.FlightManager;
import com.flightreservation.model.domain.FlightInformation;
import com.flightreservation.model.services.exception.FlightException;

import junit.framework.TestCase;

public class FlightManagerTest extends TestCase{
	
	FlightManager flightManager;
	FlightInformation flight;
	
	@Override
	protected void setUp() throws Exception {
		
		super.setUp();
		flightManager = FlightManager.getInstance();
	}
	
	@Test
	public void testCreateFlight() throws FlightException {
		flight = new FlightInformation("22331B", "JetBlue", "Denver", "Dallas", "12-12-2019");
		flightManager.createFlight(flight);
		System.out.println("testCreateFlight passed");
	}

	@Test
	public void testFindFlight() throws FlightException {
		
		flight = flightManager.findFlight();
		//assertTrue("testFindFlight passed", flight != null);
		System.out.println("testFindFlight passed");
	}

}
