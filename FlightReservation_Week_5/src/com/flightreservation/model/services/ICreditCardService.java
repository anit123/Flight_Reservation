package com.flightreservation.model.services;

import com.flightreservation.model.domain.CreditCard;

public interface ICreditCardService {
	public final String NAME="ICreditCardService";
	
	public boolean authenticateCreditCard(CreditCard creditCard);

}
