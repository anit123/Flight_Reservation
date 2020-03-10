package com.flightreservation.model.services;

import com.flightreservation.model.domain.Customer;
import com.flightreservation.model.services.exception.LoginException;

public interface ILoginService extends IService {
	
	public final String NAME = "ILoginService";
	
	public void createCustomer(Customer customer) throws LoginException;
	
	public boolean authenticateCustomer(Customer customer) throws LoginException;

}
