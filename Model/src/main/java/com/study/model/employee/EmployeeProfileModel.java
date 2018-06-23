package com.study.model.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_profile")
public class EmployeeProfileModel {

	int a =20;
	String fof = "test";
	@Id
	@Column(name = "emp_id")
	private String emp_id;
	@Column(name = "emp_name")
	private String empName;
	@Column(name = "dept_id")
	private String deptId;
	@Column(name = "dept_name")
	private String deptName;
	@Column(name = "emp_type")
	private String empType;
	@Column(name = "designation")
	private String designation;
	@Column(name = "city")
	private String city;
	@Column(name = "branch_id")
	private String branchId;
	@Column(name = "branch_name")
	private String branchName;
	@Column(name = "dob")
	private String dob;
	@Column(name = "doj")
	private String doj;
	@Column(name = "govt_id_name")
	private String govtIdName;
	@Column(name = "govt_id_no")
	private String govtIdNo;
	@Column(name = "gender")
	private String gender;
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getGovtIdName() {
		return govtIdName;
	}
	public void setGovtIdName(String govtIdName) {
		this.govtIdName = govtIdName;
	}
	public String getGovtIdNo() {
		return govtIdNo;
	}
	public void setGovtIdNo(String govtIdNo) {
		this.govtIdNo = govtIdNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
