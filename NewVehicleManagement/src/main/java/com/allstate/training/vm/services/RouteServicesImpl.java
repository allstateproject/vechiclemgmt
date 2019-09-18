package com.allstate.training.vm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allstate.training.vm.daos.RouteDao;
import com.allstate.training.vm.entities.Route;
import com.allstate.training.vm.entities.RouteDetails;
import com.allstate.training.vm.exceptions.BuisnessException;

@Service
public class RouteServicesImpl implements RouteServices{
	
	@Autowired
	private RouteDao routeDao;

	public void addRoute(Route route) throws BuisnessException {
		if(route==null || (!route.getRouteId().startsWith("R_")))
			throw new BuisnessException("Fuck off!!");
		// TODO Auto-generated method stub
		routeDao.addRoute(route);
		
	}

	public void deleteRoute(String routeId) throws BuisnessException {
		// TODO Auto-generated method stub
		if(routeId==null)
			throw new BuisnessException("Fuck off twice");
		routeDao.deleteRoute(routeId);
	}

	public void updateRoute(Route route) throws BuisnessException {
		if(!route.getRouteId().startsWith("R_"))
			throw new BuisnessException("Go into the middle of nowhere");
		// TODO Auto-generated method stub
		routeDao.updateRoute(route);
		
	}

	public Route getRoutebyId(String routeId) throws BuisnessException {
		// TODO Auto-generated method stub
		if(routeId==null)
			throw new BuisnessException("The only thing could be null is .....");
		return routeDao.getRoutebyId(routeId);
	}

	public List<Route> getAll() throws BuisnessException {
		// TODO Auto-generated method stub
		return routeDao.getAll();
	}

	public void addRouteDetailsforRoute(RouteDetails routeDetails) throws BuisnessException {
		// TODO Auto-generated method stub
		if(routeDetails==null)
			throw new BuisnessException("RouteDetails is null");
		
		routeDao.addRouteDetailsforRoute(routeDetails);
	}

	public void updateRoutDetailsforRoute(RouteDetails routeDetails) throws BuisnessException {
		// TODO Auto-generated method stub
		if(routeDetails==null)
			throw new BuisnessException("Too lazy to write anything legit");
		routeDao.updateRoutDetailsforRoute(routeDetails);
	}

	public List<RouteDetails> getRouteDetailsByRoute(String routeid) throws BuisnessException {
		// TODO Auto-generated method stub
		return routeDao.getRouteDetailsByRoute(routeid);
	}

}
