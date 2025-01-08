package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class MainUpdateEmp {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int id=4;
		Employee emp =ss.get(Employee.class, id);
		emp.setEmpname("Nidhi");
		emp.setDepartment("data scientist");
		//emp.setSalary(40000);
		ss.merge(emp);
		tr.commit();
		ss.close();
		
		System.out.println("data updated successfully");
	}

}
