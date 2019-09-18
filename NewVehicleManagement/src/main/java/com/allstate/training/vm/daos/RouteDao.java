package com.allstate.training.vm.daos;

import java.util.List;

import com.allstate.training.vm.entities.Route;
import com.allstate.training.vm.entities.RouteDetails;

public interface RouteDao {
	public void addRoute(Route route);
	public void deleteRoute(String route);
	public void updateRoute(Route route);
	public Route getRoutebyId(String routeId);
	public List<Route> getAll();
	public void addRouteDetailsforRoute(RouteDetails routeDetails);
	public void updateRoutDetailsforRoute(RouteDetails routeDetails);
	public List<RouteDetails> getRouteDetailsByRoute(String routeid);
	
}
