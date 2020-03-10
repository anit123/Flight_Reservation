package com.flightreservation.model.services.factory;

import com.flightreservation.model.business.exception.ServiceLoadException;
import com.flightreservation.model.services.FlightServiceImpl;
import com.flightreservation.model.services.IFlightService;
import com.flightreservation.model.services.ILoginService;
import com.flightreservation.model.services.IService;
import com.flightreservation.model.services.LoginServiceImpl;

public class ServiceFactory {
	
	private ServiceFactory() {
		
	}
	
	private static ServiceFactory  serviceFactory = new ServiceFactory();
	
	public static ServiceFactory getInstance() {
		return serviceFactory;
	}
	
	public IService getService(String serviceName) throws ServiceLoadException {
		
		try {
			Class<?> c = Class.forName(getImplName(serviceName));
			return (IService) c.newInstance();
		} catch (Exception excp) {
			serviceName = serviceName + "not loaded";
			throw new ServiceLoadException(serviceName, excp);
		}
	}
	
	private String getImplName(String serviceName) throws Exception {

		java.util.Properties props = new java.util.Properties();

		

		String propertyFileLocation = System.getProperty("prop_location");
		//String propertyFileLocation = System.getProperty("config/application.properties ");
		

		System.out.println("Property File Location passed : "
				+ propertyFileLocation);
		java.io.FileInputStream fis = new java.io.FileInputStream(
				propertyFileLocation);

		props.load(fis);
		fis.close();
		return props.getProperty(serviceName);
	}
	


}
