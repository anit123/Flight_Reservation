package com.flightreservation.model.services;

import com.flightreservation.model.domain.CreditCard;

public interface ICreditCardService extends IService{
	public final String NAME="ICreditCardService";
	
	public void createCreditCared(CreditCard creditCard);
	public boolean authenticateCreditCard(CreditCard creditCard);

}
