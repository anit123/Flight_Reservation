package com.flightreservation.model.services;

import static org.junit.Assert.*;

import org.junit.Test;

import com.flightreservation.model.business.exception.ServiceLoadException;
import com.flightreservation.model.domain.Customer;
import com.flightreservation.model.services.exception.CustomerException;
import com.flightreservation.model.services.factory.ServiceFactory;

import junit.framework.TestCase;

public class CustomerServiceImplTest extends TestCase{
	ServiceFactory serviceFactory;
	Customer customer;
	
	@Override
	protected void setUp() throws Exception {
		
		super.setUp();
		
		serviceFactory = ServiceFactory.getInstance();
		customer = new Customer("Vicky", "Donar", 101, 23452345, "vicky@vicky.com", "vicky123", 789789232L);
		
	}

	@Test
	public void testCreateCustomer() {
		ICustomerService iCustomerService;
		try {
			iCustomerService = (ICustomerService) serviceFactory.getService(ICustomerService.NAME);
			iCustomerService.createCustomer(customer);
		} catch (CustomerException e) {
			System.out.println("createCustomer failed");
			e.printStackTrace();
		} catch (ServiceLoadException e) {
			e.printStackTrace();
		}
	}
	
	public void testFindCustomer() {
		ICustomerService iCustomerService;
		try {
			iCustomerService = (ICustomerService) serviceFactory.getService(ICustomerService.NAME);
			Customer customer = iCustomerService.findCustomer();
			System.out.println(customer);
			
		} catch (CustomerException e) {
			System.out.println("CustomerServiceImpl::findCustomer failed");
			e.printStackTrace();
		}catch (ServiceLoadException e) {
			e.printStackTrace();
		}
	}

}
