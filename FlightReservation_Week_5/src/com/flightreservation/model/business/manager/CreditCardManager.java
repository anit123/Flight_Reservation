package com.flightreservation.model.business.manager;

import com.flightreservation.model.business.exception.ServiceLoadException;
import com.flightreservation.model.domain.CreditCard;
import com.flightreservation.model.services.ICreditCardService;
import com.flightreservation.model.services.factory.ServiceFactory;

public class CreditCardManager extends ManagerSuperType{
	
	private static CreditCardManager _instance;
	private CreditCardManager() {}
	
	public static synchronized CreditCardManager getInstance() {
		if(_instance == null){
			_instance = new CreditCardManager();
		}
		return _instance;
	}
	
	public boolean checkCreditCard(CreditCard creditCard) {
		boolean isValid = false;
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		try {
			ICreditCardService  creditCardService= (ICreditCardService) serviceFactory.getService(ICreditCardService.NAME);
			isValid = creditCardService.authenticateCreditCard(creditCard);
			
		} catch (ServiceLoadException e) {
			System.out.println("CreditCardManagare checkCreditCard Failed");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("failed");
			e.printStackTrace();
		}
		
		
		return isValid;
	}

}
