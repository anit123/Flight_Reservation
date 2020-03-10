package com.flightreservation.model.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.flightreservation.model.domain.Customer;
import com.flightreservation.model.services.exception.LoginException;

public class LoginServiceImpl implements ILoginService {

	@Override
	public boolean authenticateCustomer(Customer customer) throws LoginException{
		
		boolean isValid = false;
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("registeredCustomer.out"))){
			
			Customer newCustomer = (Customer) in.readObject();
			if(customer.equals(newCustomer)) {
				isValid = true;
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return isValid;
	}

}
