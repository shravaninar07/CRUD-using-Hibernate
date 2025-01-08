package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Hospital;

public class DeleteHospMain {

	public static void main(String[] args) {
		Configuration cfg =  new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hospital.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		Hospital hosp =ss.get(Hospital.class, 1); 
		ss.remove(hosp);
		tr.commit();
		ss.close();
		System.out.println("data deleted successfully");

	}

}
