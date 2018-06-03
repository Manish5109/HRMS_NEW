package com.study.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.doa.employee.EmployeeProfileDOA;
import com.study.model.employee.EmployeeProfileModel;

@Service
public class EmployeeProfileService {

	@Autowired
	EmployeeProfileDOA epd;
	
	public void saveProfileService(EmployeeProfileModel epm){
		epd.saveProfileDOA(epm);
	}
}
