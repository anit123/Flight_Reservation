package com.flightreservation.model.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flightreservation.model.domain.Customer;
import com.flightreservation.model.services.exception.CustomerException;

public class CustomerServiceImpl implements ICustomerService {

	@Override
	public void createCustomer(Customer customer) throws CustomerException {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("customerInfo.out"));
			out.writeObject(customer);
			out.flush();
			out.close();
			
		}catch (FileNotFoundException e) {
			
			System.out.println("File not found");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("IOException found");
			e.printStackTrace();
		}

	}

	@Override
	public Customer findCustomer() throws CustomerException {
		Customer customer = null;
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("customerInfo.out"));
			customer = (Customer) in.readObject();
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not found");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("IOException found");
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return customer;
	}

}
