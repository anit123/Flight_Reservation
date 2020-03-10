package com.flightreservation.model.services;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flightreservation.model.domain.CreditCard;

public class CreditCardServiceImpl implements ICreditCardService {
	
	

	@Override
	public boolean authenticateCreditCard(CreditCard creditCard) {
		
		boolean isValid = false;
		ObjectInputStream in = null;
				try {
					in = new ObjectInputStream(new FileInputStream("cardInfo.out"));
					CreditCard newCreditCard = (CreditCard) in.readObject();
					if(creditCard.equals(newCreditCard)) {
						isValid = true;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
		
		return isValid;
	}

}
