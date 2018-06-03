package com.study.services;

import java.util.List;

import com.study.hibernate.bean.Employee;

public interface EmployeeServices {
	public void saveEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public List listEmployee();
	

}
