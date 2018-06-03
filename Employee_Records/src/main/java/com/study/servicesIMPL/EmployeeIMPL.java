package com.study.servicesIMPL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.study.hibernate.bean.Employee;
import com.study.hibernate.util.DBUtils;
import com.study.services.EmployeeServices;

public class EmployeeIMPL implements EmployeeServices {

	@Override
	public void saveEmployee(Employee emp) {
		Session session = DBUtils.getConnection().openSession();
		Transaction trx = session.beginTransaction();
		session.save(emp);
		trx.commit();
		session.close();
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		Session session = DBUtils.getConnection().openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		session.saveOrUpdate(emp);
		tx.commit();
		session.close();
	}

	@Override
	public List<Employee> listEmployee() {
		// TODO Auto-generated method stub
		List list = null;
		Session session = DBUtils.getConnection().openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		list = session.createQuery("from Employee").list();
		return list;
	}
	
	
}
