package com.allstate.training.vm.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.allstate.training.vm.entities.Route;
import com.allstate.training.vm.entities.RouteDetails;

@Repository
public class RouteDaoImpl implements RouteDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public void addRoute(Route route) {
		Session session=sessionFactory.openSession();
		//Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(route);
		session.getTransaction().commit();
		session.close();
		// TODO Auto-generated method stub
		
	}

	public void deleteRoute(String routeId) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Route route=(Route)session.get(Route.class, routeId);
		session.delete(route);
		session.getTransaction().commit();
		// TODO Auto-generated method stub
		
	}

	public void updateRoute(Route route) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.update(route);
		session.getTransaction().commit();
		// TODO Auto-generated method stub
		
	}

	public Route getRoutebyId(String routeId) {
		Session session=sessionFactory.openSession();
		
        Route route=(Route)session.get(Route.class, new String(routeId));
		session.close();
		return route;
	}

	public List<Route> getAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<Route> routeList=session.createCriteria(Route.class).list();
		return routeList;
	}

	public void addRouteDetailsforRoute(RouteDetails routeDetails) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(routeDetails);
		
		session.getTransaction().commit();
		session.close();
		// TODO Auto-generated method stub
		
	}

	public void updateRoutDetailsforRoute(RouteDetails routeDetails) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.update(routeDetails);
		session.close();
		// TODO Auto-generated method stub
	}

	public List<RouteDetails> getRouteDetailsByRoute(String routeid) {
		Session session=sessionFactory.openSession();
		List<RouteDetails> routeDetailsByRoute=session.createCriteria(RouteDetails.class).list();
		// TODO Auto-generated method stub
		return routeDetailsByRoute;
	}

}