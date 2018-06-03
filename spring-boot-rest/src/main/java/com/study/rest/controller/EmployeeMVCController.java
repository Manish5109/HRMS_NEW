package com.study.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeMVCController {
	
	@RequestMapping(value="/employeeprofile", method=RequestMethod.POST)
	public String employee(){
		return "EmployeeProfile";
	}

}
