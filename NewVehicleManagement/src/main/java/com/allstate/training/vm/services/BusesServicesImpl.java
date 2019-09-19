package com.allstate.training.vm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allstate.training.vm.daos.BusesDao;
import com.allstate.training.vm.entities.Buses;
import com.allstate.training.vm.exceptions.BuisnessException;

@Service
public class BusesServicesImpl implements BusesServices {
	@Autowired
	BusesDao busesDao;

	public void addBus(Buses b)throws BuisnessException {
		// TODO Auto-generated method stub
		if(b.getBusId().matches("[A-Z0-9]{2,3}")) {
			busesDao.addBus(b);
		}
		else {
			throw new BuisnessException("Invalid Bus Id");
		}
		
		
	}

	public void updateSeats(String busId,int bookedSeats)throws BuisnessException {
	int seats=	busesDao.getEmptySeats(busId);
		if(seats>0) {
			busesDao.updateSeats(busId, bookedSeats);
		}
		else
		{
			throw new BuisnessException("All seats booked");
		}
		
	}

	public void deleteBus(String busId)throws BuisnessException {
	Buses b=busesDao.getBusById(busId);
	if(b.equals(b)) {
		busesDao.deleteBus(busId);
	}
	else {
		throw new BuisnessException("No Buses Available");
	}
		
	}

	public Buses getBusById(String busId) throws BuisnessException {
		Buses b=busesDao.getBusById(busId);
		if(b.getBusId().matches("[A-Z0-9]{2,5}")) {
			return busesDao.getBusById(busId);
		}
		else {
			throw new BuisnessException("Invalid Bus ID");
		}
	}

	public int getEmptySeats(String busId)throws BuisnessException {
		int seats=	busesDao.getEmptySeats(busId);
		if(seats>0) {
			return busesDao.getEmptySeats(busId);
		}
		else
		{
			throw new BuisnessException("All seats filled");
		}
	}

	public List<Buses> getAll()throws BuisnessException {
		List<Buses> buses=busesDao.getAll();
		if(!buses.isEmpty())return buses;
		else {
			throw new BuisnessException("NO Buses Available");
		}
	}

	 

}
