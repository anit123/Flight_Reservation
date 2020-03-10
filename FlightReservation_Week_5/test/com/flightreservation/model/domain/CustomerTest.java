package com.flightreservation.model.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {


	 private Customer customer1, customer2;

	@Before
	public void setUp() throws Exception{
		
		 customer1 = new Customer( "Jonny", "Doi", 1111, 112344, "jonnydoi@gmail.com", "jonny123", 72023L);
		 customer2 = new Customer( "Jonny", "Doi", 1111, 112344, "jonnydoi@gmail.com", "jonny123", 72023L);
	}
	
	
	@Test
	public final void testValidateCustomer() {
		
		assertTrue("customers Validates", customer1.validate());
		System.out.println("testValidate PASSED");
	}
	
	
	public final void testEqualsTest() {
		
		assertTrue( "customer1 equals customr2",customer1.equals(customer2));
		System.out.println("testEqualsTest passed");
		
	}

}
