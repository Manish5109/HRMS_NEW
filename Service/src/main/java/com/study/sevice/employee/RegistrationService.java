package com.study.sevice.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dao.update.EmpRegDAO;
import com.study.model.registration.EmployeeRegistration;

@Service
public class RegistrationService {

	@Autowired
	private EmpRegDAO empRegDAO;

	public void saveRegistration(EmployeeRegistration er) {
		empRegDAO.saveRegistration(er);
	}

	public EmployeeRegistration getReg(String id) {
		EmployeeRegistration empReg = empRegDAO.getReg(id);
		return empReg;
	}
	public void deleteRegistration(String id){
		empRegDAO.deleteRegistration(id);
	}
}
