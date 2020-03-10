package com.flightreservation.model.services;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.flightreservation.model.business.exception.ServiceLoadException;
import com.flightreservation.model.domain.FlightInformation;
import com.flightreservation.model.services.exception.FlightException;
import com.flightreservation.model.services.factory.ServiceFactory;

import junit.framework.TestCase;

public class FlightServiceImplTest extends TestCase{
	
	ServiceFactory serviceFactory;
	FlightInformation flightInformation;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		serviceFactory = ServiceFactory.getInstance();
		flightInformation = new FlightInformation("101A", "BDelta", "DEN", "DFW", "2017-01-23");
		


		
		
	}
	

	@Test
	public void testFlightServiceCreate() throws FlightException {
		IFlightService flightService;
		try {
			flightService = (IFlightService) serviceFactory.getService(IFlightService.NAME);
			flightService.createFlight(flightInformation);
		} catch (FlightException e) {
			e.printStackTrace();
		}catch (ServiceLoadException e) {
			e.printStackTrace();
		}
		
		System.out.println("testFlightServiceCreate");
	}
	
	@Test
	public void testFlightServiceUpdate() throws FlightException {
		IFlightService flightService;
		try {
			flightService = (IFlightService) serviceFactory.getService(IFlightService.NAME);
			
			flightService.getFlight();
			System.out.println(flightService.getFlight());
		} catch (FlightException e) {
			e.printStackTrace();
		}catch (ServiceLoadException e) {
			e.printStackTrace();
		}

		System.out.println("testFlightServiceCreate");
		
	}

}
