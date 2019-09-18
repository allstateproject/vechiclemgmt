package com.allstate.training.vm.daos;

import java.util.List;

import com.allstate.training.vm.entities.Buses;

public interface BusesDao {
	public void addBus(Buses b);
	public int updateSeats(String busId,int bookedSeats);
	public void deleteBus(String busId);
	public Buses getBusById(String busId);
	public int getEmptySeats(String busId);
	public List<Buses> getAll();
	

	
	

}
