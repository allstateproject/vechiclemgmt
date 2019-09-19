package com.allstate.training.vm.daos;
import com.allstate.training.vm.entities.Buses;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BusesDaoImpl implements BusesDao {
	@Autowired
	SessionFactory sessionFactory;
	

	public void addBus(Buses b) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(b);
		session.getTransaction().commit();
		session.close();
		

	}

	
	public int updateSeats(String busId, int currentlyBookedSeats) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	Buses b=(Buses)session.get(Buses.class, busId);
	int remainingSeats=b.getSeatingCapacity()-b.getBookedSeats()-currentlyBookedSeats;
	session.close();
		return remainingSeats;
		
		
		
	}

	public void deleteBus(String busId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	Buses b=(Buses)session.get(Buses.class, busId);
	session.delete(b);
	session.getTransaction().commit();
	session.close();

	}

	public Buses getBusById(String busId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	Buses b=(Buses)session.get(Buses.class, busId);
	session.close();
	return b;
		

	}

	public int getEmptySeats(String busId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	Buses b=(Buses)session.get(Buses.class, busId);
	session.close();
		
		return b.getSeatingCapacity()-b.getBookedSeats();

	}
	
	
	


	public List<Buses> getAll(){
		Session session=sessionFactory.openSession();
		List<Buses> buses=session.createCriteria(Buses.class).list();
		return buses;
		
	}

	

}
