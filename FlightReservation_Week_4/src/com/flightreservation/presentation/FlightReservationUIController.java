package com.flightreservation.presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import com.flightreservation.model.business.manager.FlightManager;

import com.flightreservation.model.domain.FlightInformation;

public class FlightReservationUIController implements ActionListener{
	
	private FlightReservationUI flightReservationUI;
	
	public FlightReservationUIController() {}
	
	public FlightReservationUIController(FlightReservationUI flightReservationUI) {
		this.flightReservationUI = flightReservationUI;
		flightReservationUI.getSubmitButton().addActionListener(this);
		flightReservationUI.getCancelButton().addActionListener(this);

		Utils.centerScreen(flightReservationUI);
		flightReservationUI.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Inside FlightReservationUIController::actionPerformed");

		if (e.getSource().equals(flightReservationUI.getSubmitButton())) {
			submit_actionPerformed(e);
		}
		if (e.getSource().equals(flightReservationUI.getCancelButton())) {
			
			cancel_actionPerformed(e);
		}
		
	}
	
public void submit_actionPerformed(ActionEvent actionEveent) {
		
		FlightInformation flightInfo = flightReservationUI.getFlightInfo();
		
		FlightManager flightManager = FlightManager.getInstance();
		try {
			flightManager.createFlight(flightInfo);
			
			DialogBox dialogBox = new DialogBox("Flight Reservation Confirmation", "Successfully Flight Reserved ");
			Utils.centerScreen(dialogBox);
			dialogBox.setModal(true);
			dialogBox.show();

			flightReservationUI.setVisible(false);
			flightReservationUI.dispose();
		} catch (Exception e) {
			DialogBox dialogBox = new DialogBox( "Internal Error" , "Unable to Reserve Flight. Please try back later!");
			Utils.centerScreen(dialogBox);
			dialogBox.setModal(true);
			dialogBox.show();
			e.printStackTrace();
		}
		

	}

	public void cancel_actionPerformed(ActionEvent actionEveent) {
		flightReservationUI.setVisible(true);
		flightReservationUI.dispose();

	}

}
