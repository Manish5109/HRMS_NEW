package com.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.study.model.registration.EmployeeRegistration;
import com.study.service.employee.EmployeeListService;

@Controller
public class ListController {
	@Autowired
	EmployeeListService els;

	@RequestMapping(value = "/employeeList", method = RequestMethod.POST)
	public ModelAndView registration(Model model) {
		List<EmployeeRegistration> list = els.getEmployeeList();
		return new ModelAndView("list", "list", list);

	}

	@RequestMapping(value = "/employeeListService", method = RequestMethod.GET)
	@ResponseBody
	public List<EmployeeRegistration> employeeListService(Model model) {
		List<EmployeeRegistration> list = els.getEmployeeList();
		return list;
	}

	// JWT

}
