package com.allstate.training.vm.daos;

import java.time.LocalDateTime;
import java.util.List;

import com.allstate.training.vm.entities.Booking;

public interface BookingDao {
	public void addBooking(Booking boo);
	public void updateBooking(Booking boo);
	public void deleteBooking(String id);
	public Booking getBookingById(String id);
	public List<Booking> getAll();
	public List<Booking> getBookingByPassengerId(String id);
	public List<Booking> getBookingByBusId(String id);
	public List<Booking> getBookingByRouteId(String id);
	public List<Booking> getBookingByModeOfPayment(String mod);
	public List<Booking> getBookingBetweenTime(LocalDateTime start,LocalDateTime end);
	public List<Booking> getBookingBySource(String source);
	public List<Booking> getBookingByDestination(String destination);
	public List<Booking> getBookingBySourceAndDestination(String source,String destination);
	
}
