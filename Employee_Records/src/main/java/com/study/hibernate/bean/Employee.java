package com.study.hibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
//	@GeneratedValue
	@Column(name ="seq_no")
	private int sequence;
	
	@Column(name="emp_name")
	private String name;
	
	@Column(name="emp_ID")
	private String id;
	
	@Column(name="emp_salary")
	private int salary;
	
	@Column(name="emp_contact")
	private long contact;
	
	@Column(name="emp_address")
	private String address;

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}

//create table employee(
//seq_no int,
//Emp_name varchar(40),
//emp_ID varchar(30),
//emp_salary int,
//emp_contact bigint,
//emp_address varchar(100))