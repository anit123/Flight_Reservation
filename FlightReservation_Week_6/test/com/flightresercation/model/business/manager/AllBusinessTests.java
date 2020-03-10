package com.flightresercation.model.business.manager;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CreditCardManagerTest.class, CustomerManagerTest.class, FlightManagerTest.class,
		LoginManagerTest.class })
public class AllBusinessTests {

}
