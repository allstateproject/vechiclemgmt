package com.allstate.training.vm.services;

import java.util.List;

import com.allstate.training.vm.entities.Route;
import com.allstate.training.vm.entities.RouteDetails;
import com.allstate.training.vm.exceptions.BuisnessException;

public interface RouteServices {
	
	public void addRoute(Route route) throws BuisnessException;
	public void deleteRoute(String route) throws BuisnessException;
	public void updateRoute(Route route) throws BuisnessException;
	public Route getRoutebyId(String routeId) throws BuisnessException;
	public List<Route> getAll() throws BuisnessException;
	public void addRouteDetailsforRoute(RouteDetails routeDetails) throws BuisnessException;
	public void updateRoutDetailsforRoute(RouteDetails routeDetails) throws BuisnessException;
	public List<RouteDetails> getRouteDetailsByRoute(String routeid) throws BuisnessException;

}