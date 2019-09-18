package com.allstate.training.vm.services;

import java.time.LocalDateTime;
import java.util.List;

import com.allstate.training.vm.daos.BookingDaoImpl;
import com.allstate.training.vm.entities.Booking;

public class BookingServicesDaoImpl implements BookingServicesDao{
	
	BookingDaoImpl bookingDaoImpl;
	
	public void addBooking(Booking boo) {
		if(boo.getBookId().startsWith("BOOK")) {
			bookingDaoImpl.addBooking(boo);
		}else {
			//throw 
		}
		
	}

	public void updateBooking(Booking boo) {
		// TODO Auto-generated method stub
		
	}

	public void deleteBooking(String id) {
		// TODO Auto-generated method stub
		
	}

	public Booking getBookingById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Booking> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Booking> getBookingByPassengerId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Booking> getBookingByBusId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Booking> getBookingByRouteId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Booking> getBookingByModeOfPayment(String mod) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Booking> getBookingBetweenTime(LocalDateTime start, LocalDateTime end) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Booking> getBookingBySource(String source) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Booking> getBookingByDestination(String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Booking> getBookingBySourceAndDestination(String source, String destination) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
