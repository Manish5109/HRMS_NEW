package com.study.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.study.hibernate.bean.Employee;
import com.study.servicesIMPL.EmployeeIMPL;

@Controller
public class EmpController {
	EmployeeIMPL impl = new EmployeeIMPL();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root(ModelMap map) {
		return "welcome";
	}
	
	@RequestMapping(value="/employeeList", method = RequestMethod.POST)
	public ModelAndView empList(ModelMap model){
		List list = impl.listEmployee();
		return new ModelAndView("employeeList","list", list);
	}

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public ModelAndView reg(ModelMap map) {
		return new ModelAndView("registration", "msg", "Fill the form.");
	}

	@RequestMapping(value = "/regSubmit", method = RequestMethod.POST)
	public ModelAndView regSubmit(HttpServletRequest request, HttpServletResponse response) {
		Employee emp = new Employee();
		
		String msg = "user name can not blank";
		String name = request.getParameter("empName");
		String id = request.getParameter("empId");
		int salary = Integer.parseInt(request.getParameter("empSalary"));
		long contact = Long.parseLong(request.getParameter("empContact"));
		String address = request.getParameter("empAddress");
		if (name.equals("") || name == null) {
			return new ModelAndView("registration", "msg", msg);
		} else {
			emp.setSequence(2);
			emp.setName(name);
			emp.setId(id);
			emp.setSalary(salary);
			emp.setContact(contact);
			emp.setAddress(address);
			impl.saveEmployee(emp);
			return new ModelAndView("welcome", "msg", msg);
			// return "regSubmit";
		}
		// return new ModelAndView("registration","msg", msg);
	}

}
