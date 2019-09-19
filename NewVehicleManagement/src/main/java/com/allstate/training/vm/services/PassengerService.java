package com.allstate.training.vm.services;

import java.util.List;

import com.allstate.training.vm.entities.Passenger;
import com.allstate.training.vm.exceptions.BuisnessException;

public interface PassengerService {
	public void addPassenger(Passenger passenger)throws BuisnessException;
	public void updatePassengerPhone(String passengerId, String passengerPhone)throws BuisnessException;
	public void updatePassengerAge(String passengerId,int passengerAge)throws BuisnessException;
	public void updateNoOfTrips(String passengerId,int noOfTrips)throws BuisnessException;
	public void updateEmgContact(String passengerId,String passengerEmgContact)throws BuisnessException;
	public void updateAdharNum(String passengerId,String adharNum) throws BuisnessException;
	public void deletePassenger(int passengerId)throws BuisnessException;
	public void updatePassenger(Passenger passenger)throws BuisnessException;
	public Passenger getPassengerById(String passengerId)throws BuisnessException;
	public List<Passenger> getAll()throws BuisnessException;
}
