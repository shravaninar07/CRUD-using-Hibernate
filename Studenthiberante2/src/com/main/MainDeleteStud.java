package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class MainDeleteStud {

	public static void main(String[] args) {
		Configuration  cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		int id=2;
		Student s1= ss.get(Student.class, id);
	    ss.remove(s1);
	    tr.commit();
	    ss.close();
	    
	    
	    System.out.println("data deleted succesfully");
	}

}
