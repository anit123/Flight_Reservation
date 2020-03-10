package com.flightreservation.model.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flightreservation.model.domain.Customer;
import com.flightreservation.model.services.exception.LoginException;
public class LoginServiceImpl implements ILoginService {


	@Override
	public boolean authenticateCustomer(Customer customer) throws LoginException{
		
		boolean isValid = false;
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("loginInfo.out"))){
			
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

	@Override
	public void createCustomer(Customer customer) throws LoginException {
		ObjectOutputStream out=null;
		
		try {
		out= new ObjectOutputStream(new FileOutputStream("loginInfo.out"));
		out.writeObject(customer);
		out.flush();
		out.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
