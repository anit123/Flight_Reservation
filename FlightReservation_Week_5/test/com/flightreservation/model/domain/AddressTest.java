package com.flightreservation.model.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AddressTest {

	
	private Address address1, address2;
	
	@Before
	public void setUp() {
		address1 = new Address("10648 Huron", "Denver", "80234", "USA");
		address2 = new Address("10648 Huron", "Denver", "80234", "USA");
		
	}
	
	@Test
	public void testValidateAddress() {
		
		assertTrue("address validates", address1.validate());
		
		System.out.println("testValidateAddress passed");
		
	}
	

	
	public void testEqualsAddress() {
		assertTrue("address1 equals address2", address1.equals(address2));
		System.out.println("testEqualsAddress passed");
	}

}