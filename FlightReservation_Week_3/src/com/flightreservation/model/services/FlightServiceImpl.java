package com.flightreservation.model.services;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.flightreservation.model.domain.FlightInformation;
import com.flightreservation.model.services.exception.FlightException;

public class FlightServiceImpl implements IFlightService {

	@Override
	public void createFlight(FlightInformation flightInformation) throws FlightException {

		try {

			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("fileInformation.out"));
			out.writeObject(flightInformation);
			out.flush();
			out.close();

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			throw new FlightException("File Not Found", e);
		} catch (IOException e) {
			throw new FlightException("IOException found", e);

		}
	}

	@Override
	public FlightInformation getFlight() throws FlightException {
		
		FlightInformation flightInformation=null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("fileInformation.out"));
			flightInformation = (FlightInformation) in.readObject();
			in.close();
			
		} catch (IOException e) {
			
			throw new FlightException("IOException Found", e);
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}

		return flightInformation;
	}

}
