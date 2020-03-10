package com.flightreservation.model.business.manager;

import com.flightreservation.model.business.exception.ServiceLoadException;
import com.flightreservation.model.domain.Customer;
import com.flightreservation.model.services.ICustomerService;
import com.flightreservation.model.services.exception.CustomerException;
import com.flightreservation.model.services.factory.ServiceFactory;

public class CustomerManager extends ManagerSuperType{
	
	private static CustomerManager _instance;
	
	private CustomerManager() {}
	
	public static synchronized CustomerManager getInstance() {
		if(_instance == null) {
			_instance = new CustomerManager();
		}
		return _instance;
	}
	
	public Customer findCustomer() {
		
		Customer customer = null;
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		try {
			ICustomerService iCustomerService = (ICustomerService) serviceFactory.getService(ICustomerService.NAME);
			customer = iCustomerService.findCustomer();
		}catch (ServiceLoadException e) {
			System.out.println("CustomerManager::findCustomer failed");
		}catch (CustomerException e) {
			e.printStackTrace();
		}
		
		return customer;
		
	}

}
