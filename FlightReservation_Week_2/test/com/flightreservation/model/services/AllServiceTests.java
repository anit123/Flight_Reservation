package com.flightreservation.model.services;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.flightreservation.model.services.factory.ServiceFactoryTest;

@RunWith(Suite.class)
@SuiteClasses({ CustomerServiceImplTest.class, FlightServiceImplTest.class, LoginServiceImplTest.class,
		ServiceFactoryTest.class })
public class AllServiceTests {

}
