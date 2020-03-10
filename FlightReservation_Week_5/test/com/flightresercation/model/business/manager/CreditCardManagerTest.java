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
		creditCard = new CreditCard("1212121198K", "456", "2020", "80234");
		creditCardManager = CreditCardManager.getInstance();
	}

	@Test
	public void testCheckCreditCard() {
		
		boolean isValid = creditCardManager.checkCreditCard(creditCard);
		System.out.println(isValid);
		assertTrue(isValid);
		System.out.println("testCheckCreditCard passed");
	}

}
