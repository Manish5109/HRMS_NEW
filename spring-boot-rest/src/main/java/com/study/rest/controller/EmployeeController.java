package com.study.rest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.model.employee.EmployeeProfileModel;
import com.study.service.employee.EmployeeProfileService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeProfileService eps;
	
	@RequestMapping(value="saveProfile", method=RequestMethod.POST)
	public String saveProfile(HttpServletRequest request){
		EmployeeProfileModel epm = new EmployeeProfileModel();
		epm.setEmp_id(request.getParameter("empid"));
		epm.setEmpName(request.getParameter("empname"));
		epm.setDeptId(request.getParameter("deptid"));
		epm.setDeptName(request.getParameter("deptname"));
		epm.setEmpType(request.getParameter("emptype"));
		epm.setDesignation(request.getParameter("designation"));
		epm.setCity(request.getParameter("city"));
		epm.setBranchId(request.getParameter("branchid"));
		epm.setBranchName(request.getParameter("branchName"));
		epm.setDob(request.getParameter("dob"));
		epm.setDoj(request.getParameter("doj"));
		epm.setGovtIdName(request.getParameter("govtidname"));
		epm.setGovtIdNo(request.getParameter("govtidno"));
		epm.setGender(request.getParameter("gender"));
		
		eps.saveProfileService(epm);
		return "Success";
	}

}
