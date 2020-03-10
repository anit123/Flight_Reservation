package com.flightreservation.model.domain;

import java.io.Serializable;

public class CreditCard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String cardNumber;
	private String cardCode;
	private String cardExpireDate;
	private String cardBillingZipCode;
	
	public CreditCard() {
		
	}
	
	public CreditCard(String cardNumber, String cardCode, String cardExpireDate, String cardBillingZipCode) {
		super();
		this.cardNumber = cardNumber;
		this.cardCode = cardCode;
		this.cardExpireDate = cardExpireDate;
		this.cardBillingZipCode = cardBillingZipCode;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardCode() {
		return cardCode;
	}

	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}

	public String getCardExpireDate() {
		return cardExpireDate;
	}

	public void setCardExpireDate(String cardExpireDate) {
		this.cardExpireDate = cardExpireDate;
	}

	public String getCardBillingZipCode() {
		return cardBillingZipCode;
	}

	public void setCardBillingZipCode(String cardBillingZipCode) {
		this.cardBillingZipCode = cardBillingZipCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cardCode=" + cardCode + ", cardExpireDate=" + cardExpireDate
				+ ", cardBillingZipCode=" + cardBillingZipCode + "]";
	}
	
	
	
	
	
	

}
