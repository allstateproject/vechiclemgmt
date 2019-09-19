package com.allstate.training.vm.services;

import java.time.LocalDateTime;
import java.util.List;

import com.allstate.training.vm.entities.Booking;
import com.allstate.training.vm.exceptions.BuisnessException;

public interface BookingServicesDao{
	public void addBooking(Booking boo)throws BuisnessException;
	public void updateBooking(Booking boo)throws BuisnessException;
	public void deleteBooking(String id)throws BuisnessException;
	public Booking getBookingById(String id)throws BuisnessException;
	public List<Booking> getAll()throws BuisnessException;
	public List<Booking> getBookingByPassengerId(String id)throws BuisnessException;
	public List<Booking> getBookingByBusId(String id)throws BuisnessException;
	public List<Booking> getBookingByRouteId(String id)throws BuisnessException;
	public List<Booking> getBookingByModeOfPayment(String mod)throws BuisnessException;
	public List<Booking> getBookingBetweenTime(LocalDateTime start,LocalDateTime end)throws BuisnessException;
	public List<Booking> getBookingBySource(String source)throws BuisnessException;
	public List<Booking> getBookingByDestination(String destination)throws BuisnessException;
	public List<Booking> getBookingBySourceAndDestination(String source,String destination)throws BuisnessException;
}
