package com.allstate.training.vm.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allstate.training.vm.daos.BookingDaoImpl;
import com.allstate.training.vm.entities.Booking;
import com.allstate.training.vm.exceptions.BuisnessException;

@Service
public class BookingServicesDaoImpl implements BookingServicesDao{
	
	@Autowired
	BookingDaoImpl bookingDaoImpl;
	
	public void addBooking(Booking boo) throws BuisnessException {
		if(boo.getBookId().startsWith("BOOK")) {
			bookingDaoImpl.addBooking(boo);
		}else {
			throw new BuisnessException("Invalid Booking ID");
		}
		
	}

	public void updateBooking(Booking boo) throws BuisnessException{
		if(boo.getBookId().startsWith("BOOK")) {
			bookingDaoImpl.updateBooking(boo);
		}else {
			throw new BuisnessException("Invalid Booking ID");
		}
		
	}

	public void deleteBooking(String id) throws BuisnessException{
		if(id.startsWith("BOOK")) {
			bookingDaoImpl.deleteBooking(id);
		}else {
			throw new BuisnessException("Invalid Booking ID");
		}
		
	}

	public Booking getBookingById(String id) throws BuisnessException{
		if(id.startsWith("BOOK")) {
			return bookingDaoImpl.getBookingById(id);
		}else {
			throw new BuisnessException("Invalid Booking ID");
		}
		
	}

	public List<Booking> getAll() throws BuisnessException{
		if(bookingDaoImpl.getAll().isEmpty()) {
			throw new BuisnessException("No Bookings Available");
		}else {
			return bookingDaoImpl.getAll();
		}
		
	}

	public List<Booking> getBookingByPassengerId(String id)throws BuisnessException {
		if(bookingDaoImpl.getBookingByPassengerId(id).isEmpty()) {
			throw new BuisnessException("No Bookings Available for the given Passenger");
		}else {
			return bookingDaoImpl.getBookingByPassengerId(id);
		}
	}

	public List<Booking> getBookingByBusId(String id)throws BuisnessException {
		if(bookingDaoImpl.getBookingByBusId(id).isEmpty()) {
			throw new BuisnessException("No Bookings Available for the given Bus");
		}else {
			return bookingDaoImpl.getBookingByBusId(id);
		}
	}

	public List<Booking> getBookingByRouteId(String id)throws BuisnessException {
		if(bookingDaoImpl.getBookingByRouteId(id).isEmpty()) {
			throw new BuisnessException("No Bookings Available for the given Route");
		}else {
			return bookingDaoImpl.getBookingByRouteId(id);
		}
	}

	public List<Booking> getBookingByModeOfPayment(String mod) throws BuisnessException{
		if(bookingDaoImpl.getBookingByModeOfPayment(mod).isEmpty()) {
			throw new BuisnessException("No Bookings Available for the given Route");
		}else {
			return bookingDaoImpl.getBookingByModeOfPayment(mod);
		}
	}

	public List<Booking> getBookingBetweenTime(LocalDateTime start, LocalDateTime end) throws BuisnessException{
		if(bookingDaoImpl.getBookingBetweenTime(start, end).isEmpty()) {
			throw new BuisnessException("No Bookings Available for the given Route");
		}else {
			return bookingDaoImpl.getBookingBetweenTime(start, end);
		}
	}

	public List<Booking> getBookingBySource(String source) throws BuisnessException{
		if(bookingDaoImpl.getBookingBySource(source).isEmpty()) {
			throw new BuisnessException("No Bookings Available for the given Route");
		}else {
			return bookingDaoImpl.getBookingBySource(source);
		}
	}

	public List<Booking> getBookingByDestination(String destination) throws BuisnessException{
		if(bookingDaoImpl.getBookingByDestination(destination).isEmpty()) {
			throw new BuisnessException("No Bookings Available for the given Route");
		}else {
			return bookingDaoImpl.getBookingByDestination(destination);
		}
	}

	public List<Booking> getBookingBySourceAndDestination(String source, String destination) throws BuisnessException{
		if(bookingDaoImpl.getBookingBySourceAndDestination(source, destination).isEmpty()) {
			throw new BuisnessException("No Bookings Available for the given Route");
		}else {
			return bookingDaoImpl.getBookingBySourceAndDestination(source, destination);
		}
	}
	
}
