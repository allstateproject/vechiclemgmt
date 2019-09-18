package com.allstate.training.vm.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.allstate.training.vm.entities.Users;
import com.allstate.training.vm.exceptions.BuisnessException;
import com.allstate.training.vm.services.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getloginPage() {
		return "login";
}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String getLogin(@RequestParam("userId")String user, @RequestParam("pwd")String pass,HttpServletRequest request) {
		Users user1;
		String view=null;
		try {
			user1 = userService.login(user, pass);
			
			if(user1.getUserType().startsWith("A")) {
			view= "adminview";	
			}else if(user1.getUserType().startsWith("P")) {
				view= "passengerview";	
			}else if(user1.getUserType().startsWith("D")) {
				view= "driverview";	
			}else if(user1.getUserType().startsWith("C")) {
				view="clerkview";
			}
		} catch (BuisnessException e) {
			request.setAttribute("error", "invalid Credentails");
			return "login";
		}
		
		return view;
		
	}

}
