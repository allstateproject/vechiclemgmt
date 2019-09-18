package com.allstate.training.vm.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import java.time.LocalDateTime;

@Entity
public class Booking {
	@Id
	private String bookingId;
	private int amountPaid;
	private LocalDateTime timeStamp;
	private String modeOfPayment;
	@ManyToOne(cascade=CascadeType.ALL)
	private Passenger passengers=new Passenger();
	@OneToOne(cascade=CascadeType.ALL)
	private Route route=new Route();


	public String getBookId() {
		return bookingId;
	}

	public void setBookId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public int getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public Passenger getPassengers() {
		return passengers;
	}

	public void setPassengers(Passenger passengers) {
		this.passengers = passengers;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", amountPaid=" + amountPaid + ", timeStamp=" + timeStamp
				+ ", modeOfPayment=" + modeOfPayment + ", passengers=" + passengers + ", route=" + route + "]";
	}
	
}
