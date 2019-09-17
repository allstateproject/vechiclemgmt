package com.allstate.training.vm.entities;

import java.time.Duration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RouteDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int routeDetailsId;
	private String sourceStop;
	private String destinationStop;
	private int distance;
	private Duration duration;
	@ManyToOne
	private Route route;

	public int getRouteDetailsId() {
		return routeDetailsId;
	}

	public void setRouteDetailsId(int routeDetailsId) {
		this.routeDetailsId = routeDetailsId;
	}

	public String getSourceStop() {
		return sourceStop;
	}

	public void setSourceStop(String sourceStop) {
		this.sourceStop = sourceStop;
	}

	public String getDestinationStop() {
		return destinationStop;
	}

	public void setDestinationStop(String destinationStop) {
		this.destinationStop = destinationStop;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}
	

}
