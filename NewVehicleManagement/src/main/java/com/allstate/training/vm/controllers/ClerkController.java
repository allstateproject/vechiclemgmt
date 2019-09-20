package com.allstate.training.vm.controllers;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.allstate.training.vm.entities.Buses;
import com.allstate.training.vm.exceptions.BuisnessException;

import com.allstate.training.vm.services.BusesServices;


@Controller
public class ClerkController {
	
	@Autowired
	BusesServices busesServices;
	@RequestMapping(value="/busDetails")
	public String getname() {
		return "busDetails";
	}
	
	@RequestMapping(value="/fetchdetails",method=RequestMethod.POST)
	public ModelAndView getLogin(@RequestParam("busId")String busId,HttpServletRequest request) {
		Buses b;
		
		ModelAndView mv= new ModelAndView();
		//System.out.println("HELLOOOOOO1");
		try {
			//System.out.println("HELLOOOOOOasf1");
			 b=busesServices.getBusById(busId);
			 //System.out.println("HELLOOOOOO");
			if(b!=null) {
				mv.addObject("bus",b);
				mv.setViewName("busDetailsTableViews");
			}
		} catch (BuisnessException e) {
			request.setAttribute("error","invalid Credentials");
			mv.setViewName("busDetails");
		}
		return mv;
		
	}
	@RequestMapping(value="/addBusDetails",method=RequestMethod.POST)
	public void addbus(@RequestParam("busId")String busId,@RequestParam("modelNo")int modelNo,@RequestParam("busType")String busType,@RequestParam("policyNumber")String policyNumber,@RequestParam("regNo")String regNo,@RequestParam("dateOfPurchase")String dateOfPurchase,@RequestParam("seatingCapacity")int seatingCapacity,@RequestParam("bookedSeats")int bookedSeats){
		Buses b=null;
		b.setBusId(busId);
		b.setModelNo(modelNo);
		b.setBusType(busType);
		b.setPolicyNumber(policyNumber);
		b.setRegNo(regNo);
		b.setDateOfPurchase(dateOfPurchase);
		b.setSeatingCapacity(seatingCapacity);
		b.setBookedSeats(bookedSeats);
		try {
			busesServices.addBus(b);
		} catch (BuisnessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
