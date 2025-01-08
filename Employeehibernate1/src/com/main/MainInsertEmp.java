package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class MainInsertEmp {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss =sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		Employee emp = new Employee();
		
		emp.setEmpname("Sujata");
		emp.setDepartment("Java developer");
		emp.setSalary(25000);
		emp.setMobileno(9878787878L);
		
		ss.persist(emp);
		tr.commit();
		ss.close();
		
		System.out.println("Application started");
	}

}
