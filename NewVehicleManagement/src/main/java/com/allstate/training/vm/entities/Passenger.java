package com.allstate.training.vm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="passengerId")
public class Passenger extends Users{

	/*@Id
	private String passengerId;*/
	private String passengerName;
	private String passengerPhone;
	private String passengerGender;
	private int passengerAge;
	private int noOfTrips;
	private String passengerEmgContact;
	private String passengerBloodGroup;
	
	/*public String getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}
	*/
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getPhone() {
		return passengerPhone;
	}
	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}
	public String getPassengerGender() {
		return passengerGender;
	}
	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPssengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public int getNoOfTrips() {
		return noOfTrips;
	}
	public void setNoOfTrips(int noOfTrips) {
		this.noOfTrips = noOfTrips;
	}
	public String getPassengerEmgContact() {
		return passengerEmgContact;
	}
	public void setPassengerEmgContact(String passengerEmgContact) {
		this.passengerEmgContact = passengerEmgContact;
	}
	public String getPassengerBloodGroup() {
		return passengerBloodGroup;
	}
	public void setBloodGroup(String passengerBloodGroup) {
		this.passengerBloodGroup = passengerBloodGroup;
	}
	@Override
	public String toString() {
		return "Passenger ["+", Name=" + passengerName + ", Phone=" + passengerPhone
				+ ", Gender=" + passengerGender + ", Age=" + passengerAge + ", noOfTrips=" + noOfTrips
				+ ", EmgContact=" + passengerEmgContact + ", BloodGroup=" + passengerBloodGroup + "]";
	
}

	
	
}
