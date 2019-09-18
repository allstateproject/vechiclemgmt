package com.allstate.training.vm.services;

import java.util.List;

import com.allstate.training.vm.entities.Buses;
import com.allstate.training.vm.exceptions.BuisnessException;

public interface BusesServices {
	public void addBus(Buses b)throws BuisnessException;
	public void updateSeats(String busId,int bookedSeats)throws BuisnessException;
	public void deleteBus(String busId)throws BuisnessException;
	public Buses getBusById(String busId)throws BuisnessException;
	public int getEmptySeats(String busId)throws BuisnessException;
	public List<Buses> getAll()throws BuisnessException;
	

}
