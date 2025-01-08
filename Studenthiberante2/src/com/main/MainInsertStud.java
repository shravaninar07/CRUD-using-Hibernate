package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class MainInsertStud {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Student s = new Student();
		
		s.setSname("Maahi");
		s.setStream("ENTC");
		s.setAddharNo(987898789878l);
		s.setMobileno(7867876787l);
		
		ss.persist(s);
		tr.commit();
		ss.close();
		
		System.out.println("data inserted successfully");
		
	}

}
