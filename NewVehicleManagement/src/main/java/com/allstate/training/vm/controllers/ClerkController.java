package com.allstate.training.vm.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.allstate.training.vm.entities.Buses;
import com.allstate.training.vm.entities.Users;
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
	

}
