package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empDetails")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	private String empname;
	private String department;
	private int salary;
	private long mobileno;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public Employee(int empid, String empname, String department, int salary, long mobileno) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.department = department;
		this.salary = salary;
		this.mobileno = mobileno;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", department=" + department + ", salary=" + salary
				+ ", mobileno=" + mobileno + "]";
	}

}
