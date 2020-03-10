package com.flightresercation.model.business.manager;



import org.junit.Test;

import com.flightreservation.model.business.manager.CreditCardManager;
import com.flightreservation.model.domain.CreditCard;

import junit.framework.TestCase;

public class CreditCardManagerTest extends TestCase {
	CreditCardManager creditCardManager;
	CreditCard creditCard;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	
		creditCardManager = CreditCardManager.getInstance();
	}

	public void testCreateCreditCard() {
		creditCard = new CreditCard("1212121198K", "456", "2020", "80234");
		creditCardManager.createCreditCard(creditCard);
		System.out.println("testCreateCreditCard passed");
	}
	
	
	@Test
	public void testCheckCreditCard() {
		creditCard = new CreditCard("1212121198K", "456", "2020", "80234");
		boolean isValid = creditCardManager.checkCreditCard(creditCard);
		System.out.println(isValid);
		assertTrue(isValid);
		System.out.println("testCheckCreditCard passed");
	}

}
