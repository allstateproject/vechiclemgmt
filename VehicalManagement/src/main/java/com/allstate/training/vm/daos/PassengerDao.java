package com.allstate.training.vm.daos;

import java.util.List;

import com.allstate.training.vm.entities.Passenger;



public interface PassengerDao {
	public void addPassenger(Passenger passenger);
	public void updatePassengerPhone(String passengerId, String passengerPhone);
	public void updatePassengerAge(String passengerId,int passengerAge);
	public void updateNoOfTrips(String passengerId,int noOfTrips);
	public void updateEmgContact(String passengerId,String passengerEmgContact);
	public void deletePassenger(int passengerId);
	public Passenger getPassengerById(String passengerId);
	
	public List<Passenger> getAll();
	


}
