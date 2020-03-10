package com.flightreservation.model.services;

import com.flightreservation.model.domain.Customer;
import com.flightreservation.model.services.exception.CustomerException;

public interface ICustomerService extends IService{
	
	
	public final String NAME = "ICustomerService";
	
	public void createCustomer(Customer customer) throws CustomerException;
	
	public Customer findCustomer() throws CustomerException;

}
