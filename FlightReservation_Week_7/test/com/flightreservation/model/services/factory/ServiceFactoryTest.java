package com.flightreservation.model.services.factory;

import static org.junit.Assert.*;

import org.junit.Test;

import com.flightreservation.model.business.exception.ServiceLoadException;
import com.flightreservation.model.services.FlightServiceImpl;
import com.flightreservation.model.services.IFlightService;
import com.flightreservation.model.services.ILoginService;
import com.flightreservation.model.services.LoginServiceImpl;
import com.flightreservation.model.services.factory.ServiceFactory;

import junit.framework.TestCase;

public class ServiceFactoryTest extends TestCase{
	
	ServiceFactory serviceFactory;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		serviceFactory = ServiceFactory.getInstance();
		
		
	}
	
	@Test
	public void testGetLoginService() {
		ILoginService loginService;
		try {
			loginService = (ILoginService) serviceFactory.getService(ILoginService.NAME);
			assertTrue(loginService instanceof LoginServiceImpl);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("testGetLoginService passed");
	}
	
	
	@Test
	public void testGetFlightService() {
		IFlightService flightService;
		try {
			flightService = (IFlightService) serviceFactory.getService(IFlightService.NAME);
			assertTrue(flightService instanceof FlightServiceImpl);
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("testGetFlightService passed");
	}

}
