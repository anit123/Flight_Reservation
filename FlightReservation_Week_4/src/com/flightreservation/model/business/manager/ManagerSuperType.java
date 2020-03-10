package com.flightreservation.model.business.manager;

import com.flightreservation.model.business.exception.PropertyFileNotFoundException;
import com.flightreservation.model.services.manager.PropertyManager;

public class ManagerSuperType {

	static {
		try {
			ManagerSuperType.loadProperties();
		} catch (PropertyFileNotFoundException e) {
			System.out.println("Failed to load application properties");
			e.printStackTrace();
		}
	}

	private static void loadProperties() throws PropertyFileNotFoundException {

		// Passing properties file
		// -Dprop_location="/Users/anitadhikari/Java
		// Projects/regis-university/FlightReservation_Week3/config/application.properties"

		String propertyFileLocation = System.getProperty("prop_location");

		if (propertyFileLocation != null) {
			PropertyManager.loadProperties(propertyFileLocation);
		} else {
			System.out.println("Property File Location is Null");
			throw new PropertyFileNotFoundException("Location for property file is not set", null);
		}

	}

}
