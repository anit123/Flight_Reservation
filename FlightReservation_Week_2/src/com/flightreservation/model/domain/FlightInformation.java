package com.flightreservation.model.domain;

import java.io.Serializable;

public class FlightInformation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String flightID;
	String flightName;
	String from;
	String to;
	String date;

	public FlightInformation() {

	};

	public FlightInformation(String flihtID, String flightName, String from, String to, String date) {
		this.flightID = flihtID;
		this.flightName = flightName;
		this.from = from;
		this.to = to;
		this.date = date;
	}

	public String getFlightID() {
		return flightID;
	}

	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "FlightInformation [flightID=" + flightID + ", flightName=" + flightName + ", from=" + from + ", to="
				+ to + ", date=" + date + "]";
	}

	
	


	

}
