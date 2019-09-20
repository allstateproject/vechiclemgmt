package com.allstate.training.vm.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.allstate.training.vm.entities.Employee;
import com.allstate.training.vm.exceptions.BuisnessException;
import com.allstate.training.vm.services.EmployeeService;

@Controller
@RequestMapping("/driver")
public class DriverController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/profile")
	public ModelAndView getProfile(HttpSession session) {
		ModelAndView mv=new ModelAndView();
		
		Employee employee=null;
		try {
				
			employee=employeeService.getEmployeeById(session.getAttribute("uid").toString());
		mv.addObject("emp",employee);
		mv.setViewName("Driver_viewprofile");
		}catch(BuisnessException e) {
			mv.addObject("message",e.getMessage());
			mv.setViewName("Driver_viewprofile");
		}
		return mv;
		
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView editProfile(HttpSession session,@PathVariable("id") int id) {
		ModelAndView mv=new ModelAndView();
		Employee employee=null;
		try {
			session.getAttribute("sname");
			employee=employeeService.getEmployeeById(session.getAttribute("uid").toString());
		mv.addObject("emp",employee);
		mv.setViewName("driveredit");
		}catch(BuisnessException e) {
			mv.addObject("message",e.getMessage());
			mv.setViewName("Driver_viewprofile");
		}
		return null;
	}
	
	@RequestMapping("/update")
	public String updateDriver(@ModelAttribute Employee e) {
		
		try {
			employeeService.updateEmployee(e);
		} catch (BuisnessException e1) {
			
		}
		return "redirect:/profile";
		
	}

}
	
	
	
	
	
	
	