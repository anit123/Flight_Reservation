package com.flightreservation.model.business.manager;

import com.flightreservation.model.business.exception.ServiceLoadException;
import com.flightreservation.model.domain.Customer;
import com.flightreservation.model.services.ILoginService;
import com.flightreservation.model.services.factory.ServiceFactory;

public class LoginManager extends ManagerSuperType{
	
	private static LoginManager _instance;
	
	private LoginManager() {}
	
	public static synchronized LoginManager getInstance() {
		if(_instance == null) {
			_instance = new LoginManager();
		}
		
		return _instance;
	}
	
	public boolean loginCustomer(Customer customer) {
		
		boolean isValid = false;
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		try {
			ILoginService iLoginService = (ILoginService) serviceFactory.getService(ILoginService.NAME);
			isValid = iLoginService.authenticateCustomer(customer);
			
		} catch (ServiceLoadException e) {
			System.out.println("LoginManager loginCustomer Failed");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("loginCustomer failed");
			e.printStackTrace();
		}
		
		
		return isValid;
	}

}
