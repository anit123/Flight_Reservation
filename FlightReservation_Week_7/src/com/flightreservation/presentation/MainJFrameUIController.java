package com.flightreservation.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainJFrameUIController implements ActionListener{
	
	private MainJFrameUI mainJFrameUI;
	private CustomerLoginUI customerLoginUI;
	private CustomerLoginUIController customerLoginUIController;
	private CustomerRegisterUI customerRegisterUI;
	private CustomerRegisterUIController customerRegisterUIController;
	private FlightReservationUI flightReservationUI;
	private FlightReservationUIController flightReservationUIController;
	
	public MainJFrameUIController() {
	}
	
	public MainJFrameUIController(MainJFrameUI mainJFrameUI) {
		
		this.mainJFrameUI = mainJFrameUI;
		
		mainJFrameUI.getjExitMenu().addActionListener(this);
		mainJFrameUI.getjCustomerLoginMenu().addActionListener(this);
		mainJFrameUI.getjCustomerRegisterMenu().addActionListener(this);
		mainJFrameUI.getjFlightReservationMenu().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Inside MainFrame:: actionPerformed");
		
		if(e.getSource().equals(mainJFrameUI.getjExitMenu())) {
			exitItem_actionPerformed(e);
		}
		
		if(e.getSource().equals(mainJFrameUI.getjCustomerLoginMenu())) {
			loginCustomer_actionPerformed(e);
		}
		if(e.getSource().equals(mainJFrameUI.getjCustomerRegisterMenu())) {
			registerCustomer_actionPerformed(e);
		}
		if(e.getSource().equals(mainJFrameUI.getjFlightReservationMenu())) {
			flightReservation_actionPerformed(e);
		}
		
	}
	
	
	public void exitItem_actionPerformed(ActionEvent e) {
		
		System.out.println("Closing Application");
		System.exit(0);
		
	}
	
	public void loginCustomer_actionPerformed(ActionEvent e) {
		System.out.println("Opening Login Customer Form");
		customerLoginUI = new CustomerLoginUI();
		customerLoginUIController = new CustomerLoginUIController(customerLoginUI);
		customerLoginUI.show();
		
		
	}
	
	public void registerCustomer_actionPerformed(ActionEvent e) {
		
		System.out.println("Opening Cusomter Registration UI");
		customerRegisterUI = new CustomerRegisterUI();
		customerRegisterUIController = new CustomerRegisterUIController(customerRegisterUI);
		customerRegisterUI.show();
		
	}
	
	public void flightReservation_actionPerformed(ActionEvent e) {
		
		System.out.println("Opening Flight Reservation UI");
		flightReservationUI = new FlightReservationUI();
		flightReservationUIController = new FlightReservationUIController(flightReservationUI);
		flightReservationUI.show();
		
	}
	
	
	
	
}


