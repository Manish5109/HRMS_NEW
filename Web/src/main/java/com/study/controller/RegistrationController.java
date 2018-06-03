package com.study.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.study.model.login.Login;
import com.study.model.registration.EmployeeRegistration;
import com.study.service.employee.EmployeeListService;
import com.study.sevice.employee.LoginService;
import com.study.sevice.employee.RegistrationService;

@Controller
public class RegistrationController {

	private final static Logger LOGGER = Logger.getLogger(RegistrationController.class.getName());

	@Autowired
	private RegistrationService regService;

	@Autowired
	LoginService loginService;

	@Autowired
	EmployeeListService els;

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registration(Model model) {
		return "registration";
	}

	@RequestMapping(value = "/editReg", method = RequestMethod.GET)
	public ModelAndView edit(@RequestParam("id") String empId) {
		EmployeeRegistration registration = regService.getReg(empId);
		return new ModelAndView("registration", "emp", registration);
	}

	@RequestMapping(value = "/registrationSave", method = RequestMethod.POST)
	public String registrationSave(HttpServletRequest request) {
		EmployeeRegistration empreg = new EmployeeRegistration();

		String editFlag = request.getParameter("editFlag");
		LOGGER.info("editFlag: " + editFlag);

		empreg.setId(request.getParameter("id"));
		empreg.setFname(request.getParameter("fname"));
		empreg.setLname(request.getParameter("lname"));
		empreg.setSalary(Integer.parseInt(request.getParameter("salary")));
		empreg.setPassword(request.getParameter("pwd"));
		empreg.setUser(request.getParameter("uname"));
		empreg.setDob(request.getParameter("dob"));
		empreg.setDoj(request.getParameter("doj"));

		regService.saveRegistration(empreg);

		Login lg = new Login();
		lg.setUser(request.getParameter("uname"));
		lg.setPwd(request.getParameter("pwd"));
		loginService.saveLogin(lg);

		return "welcome";
	}

	@RequestMapping(value = "/deleteReg", method = RequestMethod.GET)
	@ResponseBody
	public Boolean delete(@RequestParam("id") String empId) {
		regService.deleteRegistration(empId);
		return true;
		// List<EmployeeRegistration> list = els.getEmployeeList();
		// return list;
	}

	@RequestMapping(value = "/deleteReg/${id}", method = RequestMethod.GET)
	@ResponseBody
	public Boolean delete1(@PathVariable("id") String empId) {
		regService.deleteRegistration(empId);
		return true;
		// List<EmployeeRegistration> list = els.getEmployeeList();
		// return list;
	}

	@RequestMapping(value = "/deleteReg/ok", method = RequestMethod.OPTIONS)
	@ResponseBody
	public Boolean delete2(@RequestParam("id") String empId) {
		regService.deleteRegistration(empId);
		return true;
		// List<EmployeeRegistration> list = els.getEmployeeList();
		// return list;
	}

	@RequestMapping(value = "/registrationSave1", method = RequestMethod.POST)
	@ResponseBody
	public String registrationSave1(@RequestBody String json, HttpServletRequest request) {

		//JsonNode jsonNode = new ObjectMapper().readTree(json);
		
		//jsonNode.get("name");
		
		request.getHeader("auth");
		
			
			request.getRemoteAddr();
		
		String editFlag = request.getParameter("editFlag");
		LOGGER.info("editFlag: " + editFlag);

		//regService.saveRegistration(empreg);

		Login lg = new Login();
		lg.setUser(request.getParameter("uname"));
		lg.setPwd(request.getParameter("pwd"));
		loginService.saveLogin(lg);

		return "welcome";
	}
}
