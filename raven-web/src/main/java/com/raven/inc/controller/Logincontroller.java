package com.raven.inc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/loginController")
public class Logincontroller {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String defaultLoginPage() {
		
		return "loginPage";
	}
	
	@RequestMapping(value = "loginPage", method = RequestMethod.GET)
	public String showLoginPage() {
		
		return "loginPage";
	}

	@RequestMapping(value = "loginSuccess", method = RequestMethod.GET)
	public String processRequest(ModelMap modelMap) {
			
		return "loginSuccess";
		
	}
}
