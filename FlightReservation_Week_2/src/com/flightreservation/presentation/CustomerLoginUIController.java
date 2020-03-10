package com.flightreservation.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.flightreservation.model.business.manager.CustomerManager;
import com.flightreservation.model.business.manager.FlightManager;
import com.flightreservation.model.business.manager.LoginManager;
import com.flightreservation.model.domain.Customer;
import com.flightreservation.model.domain.FlightInformation;

public class CustomerLoginUIController implements ActionListener{
	
	private CustomerLoginUI customerLoginUI;
	
	public CustomerLoginUIController(CustomerLoginUI customerLoginUI) {
		this.customerLoginUI = customerLoginUI;
		customerLoginUI.getSubmitButton().addActionListener(this);
		customerLoginUI.getCancelButton().addActionListener(this);

		Utils.centerScreen(customerLoginUI);
		customerLoginUI.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Inside FlightReservationUIController::actionPerformed");

		if (e.getSource().equals(customerLoginUI.getSubmitButton())) {
			submit_actionPerformed(e);
		}
		if (e.getSource().equals(customerLoginUI.getCancelButton())) {
			
			cancel_actionPerformed(e);
		}
		
	}
	
public void submit_actionPerformed(ActionEvent actionEveent) {
		
		String username = customerLoginUI.getLoginInfo()[0];
		String password = customerLoginUI.getLoginInfo()[1];
		
		LoginManager loginManager = LoginManager.getInstance();
		CustomerManager customerManager = CustomerManager.getInstance();
		Customer customer;
		DialogBox dialogBox ;
		
		try {
			customer = customerManager.findCustomer();
	
			
			if(customer.getEmail().equals(username) && customer.getPassword().equals(password)) {
			 dialogBox = new DialogBox("Login Confirmation", "Successfully login ");
			}else {
			 dialogBox = new DialogBox("Not able to login", "Invalid Username or password ");
			}
			Utils.centerScreen(dialogBox);
			dialogBox.setModal(true);
			dialogBox.show();

			customerLoginUI.setVisible(false);
			customerLoginUI.dispose();
		} catch (Exception e) {
			 dialogBox = new DialogBox( "Internal Error" , "Unable to Login. Please try back later!");
			Utils.centerScreen(dialogBox);
			dialogBox.setModal(true);
			dialogBox.show();
			e.printStackTrace();
		}
		

	}

	public void cancel_actionPerformed(ActionEvent actionEveent) {
		customerLoginUI.setVisible(true);
		customerLoginUI.dispose();

	}

}
