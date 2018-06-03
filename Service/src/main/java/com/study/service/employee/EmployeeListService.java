package com.study.service.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dao.list.DOAEmployeeList;
import com.study.model.registration.EmployeeRegistration;

@Service
public class EmployeeListService {
	@Autowired
	DOAEmployeeList doaemp;
	public List<EmployeeRegistration> getEmployeeList(){
		List<EmployeeRegistration> list = null;
		list =doaemp.employeeList();
		return list;
	}
	

}
