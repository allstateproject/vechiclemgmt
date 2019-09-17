package com.allstate.training.vm.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.allstate.training.vm.entities.Passenger;
@Repository
public class PassengerDaoImpl implements PassengerDao {
    
	@Autowired
	SessionFactory sessionFactory;
	
	
	public void addPassenger(Passenger passenger) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(passenger);
		session.getTransaction().commit();
		session.close();

	}

	

	public void deletePassenger(int passengerId) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Passenger pass=(Passenger)session.get(Passenger.class, passengerId);
		session.delete(pass);
		session.getTransaction().commit();
		session.close();
	}

	public Passenger getPassengerById(String passengerId) {
		Session session=sessionFactory.openSession();
		Passenger pass=(Passenger)session.get(Passenger.class, new String(passengerId));
		session.close();
		return pass;
	}

	public List<Passenger> getAll() {
		Session session= sessionFactory.openSession();
		List<Passenger> pass=session.createCriteria(Passenger.class).list();
		return pass;
	}

	public void updatePassengerPhone(String passengerId, String passengerPhone) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Passenger pass=(Passenger)session.get(Passenger.class, new String(passengerId));
		pass.setPassengerPhone(passengerPhone);
		session.update(pass);
		session.getTransaction().commit();
		session.close();
	}

	public void updatePassengerAge(String passengerId, int passengerAge) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Passenger pass=(Passenger)session.get(Passenger.class, new String(passengerId));
		pass.setPssengerAge(passengerAge);
		session.update(pass);
		session.getTransaction().commit();
		session.close();
		
	}

	public void updateNoOfTrips(String passengerId, int noOfTrips) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Passenger pass=(Passenger)session.get(Passenger.class, new String(passengerId));
		pass.setNoOfTrips(noOfTrips);
		session.update(pass);
		session.getTransaction().commit();
		session.close();
		
	}

	public void updateEmgContact(String passengerId, String passengerEmgContact) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Passenger pass=(Passenger)session.get(Passenger.class, new String(passengerId));
		pass.setPassengerEmgContact(passengerEmgContact);
		session.update(pass);
		session.getTransaction().commit();
		session.close();
		
	}

	

	

}
