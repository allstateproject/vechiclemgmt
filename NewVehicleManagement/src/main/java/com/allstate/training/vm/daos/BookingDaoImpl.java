package com.allstate.training.vm.daos;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.allstate.training.vm.entities.Booking;
import com.allstate.training.vm.entities.Buses;
import com.allstate.training.vm.entities.Passenger;
import com.allstate.training.vm.entities.Route;

@Repository
public class BookingDaoImpl implements BookingDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void addBooking(Booking boo) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(boo);
		session.getTransaction().commit();
		session.close();
	}

	public void updateBooking(Booking boo) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.update(boo);
		session.close();
		
	}

	public void deleteBooking(String id) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Booking boo=(Booking) session.get(Booking.class, id);
		session.delete(boo);
		session.getTransaction().commit();
		session.close();
		
	}

	public Booking getBookingById(String id) {
		Session session=sessionFactory.openSession();
		Booking boo=(Booking)session.get(Booking.class,id);
		return boo;
	}

	public List<Booking> getAll() {
		Session session=sessionFactory.openSession();
		List<Booking> lboo=session.createCriteria(Booking.class).list(); 
		return lboo;
	}

	public List<Booking> getBookingByPassengerId(String id) {
		Session session=sessionFactory.openSession();
		//Passenger passenger=(Passenger)session.get(Passenger.class, id);
		Criteria cr=session.createCriteria(Booking.class);
		cr.add(Restrictions.eq("userId", id));
		List<Booking> boo =cr.list();
		return boo;
		
	}

	public List<Booking> getBookingByBusId(String id) {
		Session session=sessionFactory.openSession();
		//Buses bus=(Buses)session.get(Buses.class, id);
		Criteria cr=session.createCriteria(Buses.class);
		cr.add(Restrictions.eq("busId", id));
		List<Booking> boo =cr.list();
		return boo;
	}

	public List<Booking> getBookingByRouteId(String id) {
		Session session=sessionFactory.openSession();
		//Route route=(Route)session.get(Route.class, id);
		Criteria cr=session.createCriteria(Route.class);
		cr.add(Restrictions.eq("routeId", id));
		List<Booking> boo =cr.list();
		return boo;
	}

	public List<Booking> getBookingByModeOfPayment(String mod) {
		Session session=sessionFactory.openSession();
		//Booking boo=(Booking)session.get(Booking.class,mod);
		Criteria cr=session.createCriteria(Booking.class);
		cr.add(Restrictions.eq("modeOfPayment", mod));
		List<Booking> boo1 =cr.list();
		return boo1;
	}

	public List<Booking> getBookingBetweenTime(LocalDateTime start, LocalDateTime end) {
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Booking.class);
		cr.add(Restrictions.between("timeStamp", start, end));
		List<Booking> boo1=cr.list();
		return boo1;
	}

	public List<Booking> getBookingBySource(String source) {
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Route.class);
		cr.add(Restrictions.eq("source", source));
		List<Booking> boo=cr.list();
		return boo;
	}

	public List<Booking> getBookingByDestination(String destination) {
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Route.class);
		cr.add(Restrictions.eq("destination", destination));
		List<Booking> boo=cr.list();
		return boo;
	}

	public List<Booking> getBookingBySourceAndDestination(String source, String destination) {
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Route.class);
		LogicalExpression andExp=Restrictions.and(Restrictions.eq("source", source), Restrictions.eq("destination", destination));
		cr.add(andExp);
		List<Booking> bookings=cr.list();
		return bookings;
	}

}
