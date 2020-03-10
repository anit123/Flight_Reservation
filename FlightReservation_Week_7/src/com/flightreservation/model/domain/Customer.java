package com.flightreservation.model.domain;

import java.io.Serializable;

public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int customerId;
	String firstName;
	String lastName;
	int IDno;
	int passportNo;
	Address address;
	String email;
	String password;
	long phoneNo;

	public Customer() {

	}

	public Customer(int customerId, String firstName, String lastName, int iDno, int passportNo, Address address,
		String email, String password, long phoneNo) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.IDno = iDno;
		this.passportNo = passportNo;
		this.address = address;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
	}

	public Customer(String firstName, String lastName, int iDno, int passportNo,String email, String password, long phoneNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.IDno = iDno;
		this.passportNo = passportNo;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
	}
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getIDno() {
		return IDno;
	}

	public void setIDno(int iDno) {
		IDno = iDno;
	}

	public int getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public boolean validate() {
		if (lastName == null)
			return false;
		if (firstName == null)
			return false;
		if (email == null)
			return false;
		if (password == null)
			return false;
		if (IDno == 0)
			return false;
		if (phoneNo == 0)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IDno;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + passportNo;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + (int) (phoneNo ^ (phoneNo >>> 32));
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
		Customer other = (Customer) obj;
		if (IDno != other.IDno)
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (customerId != other.customerId)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (passportNo != other.passportNo)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phoneNo != other.phoneNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", IDno="
				+ IDno + ", passportNo=" + passportNo + ", address=" + address + ", email=" + email + ", password="
				+ password + ", phoneNo=" + phoneNo + "]";
	}

	
	
	
}
