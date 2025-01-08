package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class MainUpdateStud {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
	    SessionFactory sf =cfg.buildSessionFactory();
	    Session ss=sf.openSession();
	    Transaction tr =ss.beginTransaction();
	    
	    int Studid=7;
	    Student s=ss.get(Student.class, Studid);
	    s.setStream("CS");
	    s.setSname("Trisha");
	    s.setMobileno(9898676756l);
	    ss.merge(s);
	    tr.commit();
	    ss.close();
	    System.out.println("data updated successfully");
	}

}
