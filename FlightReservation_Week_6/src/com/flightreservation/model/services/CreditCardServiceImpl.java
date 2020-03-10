package com.flightreservation.model.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flightreservation.model.domain.CreditCard;

public class CreditCardServiceImpl implements ICreditCardService {

	@Override
	public void createCreditCared(CreditCard creditCard) {

		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("cardInfo.out"));
			out.writeObject(creditCard);
//			out.flush();
//			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean authenticateCreditCard(CreditCard creditCard) {

		boolean isValid = false;
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("cardInfo.out"));
			CreditCard newCreditCard = (CreditCard) in.readObject();
//			System.out.println(newCreditCard.getCardNumber() + " got here");
//			System.out.println(creditCard.getCardNumber());
			if (creditCard.getCardNumber().equals(newCreditCard.getCardNumber())
					&& creditCard.getCardCode().equals(newCreditCard.getCardCode())) {
				isValid = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isValid;
	}

}
