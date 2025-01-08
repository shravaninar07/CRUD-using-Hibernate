package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Hospital;

public class UpdateHospMain {

	public static void main(String[] args) {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hospital.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Hospital hosp =  ss.get(Hospital.class, 6);
		hosp.setName("Avni");
		hosp.setDisease("Jaundice");
		hosp.setAmount(90000);
		ss.merge(hosp);
		tr.commit();
		ss.close();
		
	}

}
