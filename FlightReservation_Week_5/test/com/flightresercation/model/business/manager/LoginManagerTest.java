package com.flightresercation.model.business.manager;



import org.junit.Test;

import com.flightreservation.model.business.manager.LoginManager;
import com.flightreservation.model.domain.Customer;
import com.flightreservation.model.services.exception.LoginException;

import junit.framework.TestCase;

public class LoginManagerTest extends TestCase{
	
	LoginManager loginManager;
	Customer customer;
	
	@Override
	protected void setUp() throws Exception {
		customer = new Customer("Emrik", "DML", 9090, 12438979, "emrik@emrik.com", "Emrik123", 8787878332L);
	}

	@Test
	public void testLoginCustomer() throws LoginException{
		
		boolean isLoggedIn = loginManager.loginCustomer(customer);
		assertTrue(isLoggedIn);
		System.out.println("testLoginCustomer is passed");
		
	}

}
