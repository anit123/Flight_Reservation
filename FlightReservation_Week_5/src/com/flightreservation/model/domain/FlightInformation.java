package com.flightreservation.model.domain;

import java.io.Serializable;

public class FlightInformation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String flightID;
	String flightName;
	String From;
	String Departure;
	String date;

	public FlightInformation() {

	};

	public FlightInformation(String flihtID, String flightName, String from, String departure, String date) {
		this.flightID = flihtID;
		this.flightName = flightName;
		From = from;
		Departure = departure;
		this.date = date;
	}

	public String getFlihtID() {
		return flightID;
	}

	public void setFlihtID(String flihtID) {
		this.flightID = flihtID;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFrom() {
		return From;
	}

	public void setFrom(String from) {
		From = from;
	}

	public String getDeparture() {
		return Departure;
	}

	public void setDeparture(String departure) {
		Departure = departure;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Departure == null) ? 0 : Departure.hashCode());
		result = prime * result + ((From == null) ? 0 : From.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((flightID == null) ? 0 : flightID.hashCode());
		result = prime * result + ((flightName == null) ? 0 : flightName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightInformation other = (FlightInformation) obj;
		if (Departure == null) {
			if (other.Departure != null)
				return false;
		} else if (!Departure.equals(other.Departure))
			return false;
		if (From == null) {
			if (other.From != null)
				return false;
		} else if (!From.equals(other.From))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (flightID == null) {
			if (other.flightID != null)
				return false;
		} else if (!flightID.equals(other.flightID))
			return false;
		if (flightName == null) {
			if (other.flightName != null)
				return false;
		} else if (!flightName.equals(other.flightName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FlightInformation [flightID=" + flightID + ", flightName=" + flightName + ", From=" + From
				+ ", Departure=" + Departure + ", date=" + date + "]";
	}

	

}
