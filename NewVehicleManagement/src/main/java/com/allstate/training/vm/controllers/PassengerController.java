package com.allstate.training.vm.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.allstate.training.vm.entities.Passenger;
import com.allstate.training.vm.exceptions.BuisnessException;
import com.allstate.training.vm.services.PassengerService;

@Controller
@RequestMapping("/passenger")
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService;
	
	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public ModelAndView signup(@ModelAttribute Passenger passenger, HttpServletRequest request) {
		ModelAndView mv=new ModelAndView();
		try {
		passengerService.addPassenger(passenger);
		String pasid=passenger.getUserId();
		HttpSession session=request.getSession();
		session.setAttribute("sid", pasid);
		mv.addObject("pass",pasid);
		mv.setViewName("passengerview");
		}catch(BuisnessException e) {
			mv.addObject("error",e.getMessage());
			mv.setViewName("Passenger_signup");
			
		}
		return mv;
		
	}
	
	
    @RequestMapping(value="/passviewdetails",method=RequestMethod.GET)
    public ModelAndView passviewdetails(HttpSession session) {
		ModelAndView mv=new ModelAndView();
		try {
	Passenger passenger=passengerService.getPassengerById(session.getAttribute("sid").toString());
		mv.addObject("passenger",passenger);
		mv.setViewName("passenger_viewdetails");
		}catch(BuisnessException e) {
			mv.addObject("error",e.getMessage());
			mv.setViewName("passenger_viewdetails");
			
		}
		return mv;
    
    }
    
    
    
    /*@RequestMapping("/remove/{id}")
    public String removePerson(@PathVariable("id") String id){
		
        try {
			passengerService.deletePassenger(id);
		} catch (BuisnessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return "redirect:/passenger";
        
    }
    */
    @RequestMapping("/edit")
    public String editPerson(@ModelAttribute Passenger passenger){
        try {
			 this.passengerService.getPassengerById(passenger.getUserId());
			 passengerService.updatePassenger(passenger);
		} catch (BuisnessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return "redirect:/passviewdetails";
    }
	
	
}
