package com.flightresercation.model.business.manager;


import org.junit.Test;

import com.flightreservation.model.business.manager.CustomerManager;
import com.flightreservation.model.domain.Customer;
import com.flightreservation.model.services.exception.CustomerException;

import junit.framework.TestCase;

public class CustomerManagerTest extends TestCase {

	private CustomerManager customerManager;
	private Customer customer;
	
	@Override
	protected void setUp() throws Exception {
	
		super.setUp();
		customerManager = CustomerManager.getInstance();
		
		
	}
	
	
	@Test
	public void testCreateCustomer() {
		customer = new Customer("Anit", "Adhikari", 1122, 673942, "adhikar@anit.com", "anit123", 4572638390L);
		customerManager.createCustomer(customer);
		System.out.println("testCreateCustomer Passed");
	}
	
	@Test
	public void testFindCustomer() throws CustomerException {
		
		customer = customerManager.findCustomer();
		//assertTrue("testFindCustomerPassed", customer !=null);
		System.out.println("testFindCustomer Passed");
		
	}

}
