package com.allstate.training.vm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allstate.training.vm.daos.PassengerDao;
import com.allstate.training.vm.entities.Passenger;
import com.allstate.training.vm.exceptions.BuisnessException;
@Service
public class PassengerServiceImpl implements PassengerService {
	@Autowired
	PassengerDao passengerDao;

	public void addPassenger(Passenger pass)throws BuisnessException {
		if(pass.getUserId().startsWith("PS")) {
			passengerDao.addPassenger(pass);
		}
		throw new BuisnessException("passenger is invalid");	
	}

	public void updatePassengerPhone(String passengerId, String passengerPhone)throws BuisnessException {
		if(passengerPhone.length()==10) {
			passengerDao.updatePassengerPhone(passengerId, passengerPhone);
		}else {
			throw new BuisnessException("phone number should be 10 digits");
		}

	}

	public void updatePassengerAge(String passengerId, int passengerAge)throws BuisnessException {
		if(passengerAge>5) {
			passengerDao.updatePassengerAge(passengerId, passengerAge);
		}else {
			throw new BuisnessException("age should be greater than 5 years");
		}

	}

	public void updateNoOfTrips(String passengerId, int noOfTrips)throws BuisnessException {
		if(noOfTrips>1) {
			passengerDao.updateNoOfTrips(passengerId, noOfTrips);
		}else {
			throw new BuisnessException("atleast one trip shoul be existed to update the number of trips");
		}

	}

	public void updateEmgContact(String passengerId, String passengerEmgContact)throws BuisnessException {
		if(passengerEmgContact.length()==10) {
			passengerDao.updateEmgContact(passengerId, passengerEmgContact);
		}else {
			throw new BuisnessException("phone number should be 10 digits");
		}

	}

	public void deletePassenger(String passengerId)throws BuisnessException {
		passengerDao.deletePassenger(passengerId);
	}

	public Passenger getPassengerById(String passengerId)throws BuisnessException {
		if(!passengerId.isEmpty()) {
			passengerDao.getPassengerById(passengerId);
		}
		throw new BuisnessException("passenger is invalid");
	}

	public List<Passenger> getAll() throws BuisnessException{
		//List<Passenger> pass=passengerDao.getPassengerById(passengerId);
		if(!passengerDao.getAll().isEmpty()) {
			return passengerDao.getAll();
		}else {
			throw new BuisnessException("No Passenger available");
		}	
	}

	public void updateAdharNum(String passengerId, String adharNum) throws BuisnessException {
		if(adharNum.length()==12) {
			passengerDao.updatePassengerPhone(passengerId, adharNum);
		}else {
			throw new BuisnessException("Adhar number should be 12 digits");
		}
		
	}

	public void updatePassenger(String passengerId) throws BuisnessException {
		
		
	}


}
