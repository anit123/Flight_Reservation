package com.flightreservation.model.business.manager;

import com.flightreservation.model.business.exception.ServiceLoadException;
import com.flightreservation.model.domain.FlightInformation;
import com.flightreservation.model.services.IFlightService;
import com.flightreservation.model.services.exception.FlightException;
import com.flightreservation.model.services.factory.ServiceFactory;

public class FlightManager extends ManagerSuperType{
	
	private static FlightManager _instance;
	
	public static synchronized FlightManager getInstance() {
		if(_instance == null) {
			_instance = new FlightManager();
		}
		return _instance;
	}

	
	public FlightInformation findFlight() {
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		FlightInformation flight = null;
		try {
			
			IFlightService iFlightService = (IFlightService) serviceFactory.getService(IFlightService.NAME);
			flight = iFlightService.getFlight();
			
		} catch (ServiceLoadException e) {
			e.printStackTrace();
		}catch(FlightException e) {
			e.printStackTrace();
		}
		
		return flight;
	}
}
