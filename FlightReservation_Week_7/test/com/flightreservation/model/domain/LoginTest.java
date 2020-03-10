package com.flightreservation.model.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LoginTest {
	
	Login login1, login2;
	
	
	@Before
	public void setUp() {
		login1 = new Login("anit@anit.com", "anit123");
		login2 = new Login("anit@anit.com", "anit123");
	}

	@Test
	public void testValidateLogin() {
		
		assertTrue("validate login", login1.validate());
		System.out.println("testValidateLogin passed");
	}
	
	
	@Test
	public void testEqualsLogin() {
		
		assertTrue("login1 equals login2", login1.equals(login2));
		System.out.println("testEqualsLogin passed");
		
	}

}
