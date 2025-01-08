package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Hospital;

public class InsertHospMain {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hospital.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss =sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Hospital  hospital= new Hospital();
		hospital.setName("Devang");
		hospital.setDisease("Cancer");
		hospital.setAmount(10000l);
		
		
		ss.persist(hospital);
		System.out.println("data inserted succesfully");
		tr.commit();
		ss.close();

	}

}
