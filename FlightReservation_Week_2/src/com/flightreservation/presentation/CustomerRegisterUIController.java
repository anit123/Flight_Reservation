package com.flightreservation.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.flightreservation.model.business.manager.CustomerManager;
import com.flightreservation.model.domain.Customer;

public class CustomerRegisterUIController implements ActionListener {

	private CustomerRegisterUI customerRegisterUI;

	public CustomerRegisterUIController() {
	}

	public CustomerRegisterUIController(CustomerRegisterUI customerRegisterUI) {
		this.customerRegisterUI = customerRegisterUI;

		customerRegisterUI.getSubmitButton().addActionListener(this);
		customerRegisterUI.getCancelButton().addActionListener(this);

		Utils.centerScreen(customerRegisterUI);
		customerRegisterUI.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("Inside RegisterCustomerUIController::actionPerformed");

		if (e.getSource().equals(customerRegisterUI.getSubmitButton())) {
			submit_actionPerformed(e);
		}
		if (e.getSource().equals(customerRegisterUI.getCancelButton())) {
			
			cancel_actionPerformed(e);
		}

	}

	public void submit_actionPerformed(ActionEvent actionEveent) {
		
		Customer customer = customerRegisterUI.getRegisteredCustomer();
		
		CustomerManager customerManager = CustomerManager.getInstance();
		try {
			customerManager.createCustomer(customer);
			
			DialogBox dialogBox = new DialogBox("Register Confirmation", "Successfully customer registered");
			Utils.centerScreen(dialogBox);
			dialogBox.setModal(true);
			dialogBox.show();

			customerRegisterUI.setVisible(false);
			customerRegisterUI.dispose();
		} catch (Exception e) {
			DialogBox dialogBox = new DialogBox( "Internal Error" , "Unable to Register Customer. Please try back later!");
			Utils.centerScreen(dialogBox);
			dialogBox.setModal(true);
			dialogBox.show();
			e.printStackTrace();
		}
		

	}

	public void cancel_actionPerformed(ActionEvent actionEveent) {
		customerRegisterUI.setVisible(true);
		customerRegisterUI.dispose();

	}

}
