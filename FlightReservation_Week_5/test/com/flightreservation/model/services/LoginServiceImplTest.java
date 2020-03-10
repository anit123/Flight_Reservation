package com.flightreservation.model.services;



import org.junit.Test;

import com.flightreservation.model.business.exception.ServiceLoadException;
import com.flightreservation.model.domain.Customer;
import com.flightreservation.model.services.exception.LoginException;
import com.flightreservation.model.services.factory.ServiceFactory;

import junit.framework.TestCase;

public class LoginServiceImplTest  extends TestCase{
	
	private ServiceFactory serviceFactory;
	private Customer customer;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		serviceFactory = ServiceFactory.getInstance();
		customer = new Customer("Anit", "Adhikari", 101, 1198, "anit@gmail.com", "anit123", 6787886765L);
	}

	
	public final void testAuthenticateLogin() {
		ILoginService loginService;
		try {
			loginService = (ILoginService) serviceFactory.getService(ILoginService.NAME);
			assertTrue(loginService.authenticateCustomer(customer));
			System.out.println("testAuthenticateCustomer PASSED");
			
		} catch (LoginException e) {
			
			e.printStackTrace();
		}catch (ServiceLoadException e) {
			
		}
	}

}
