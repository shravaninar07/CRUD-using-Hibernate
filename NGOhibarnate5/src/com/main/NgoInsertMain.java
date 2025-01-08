package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Ngo;

public class NgoInsertMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Ngo.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		/*Ngo ngo= new Ngo();
		ngo.setBreed("Lab");
		ngo.setWeight(8.5f);
		ngo.setAge(4);
		ss.persist(ngo);*/
		
		Ngo ngo1= new Ngo();
		ngo1.setBreed("Pitbull");
		ngo1.setWeight(12f);
		ngo1.setAge(2);
		ss.persist(ngo1);
		tr.commit();
		ss.close();
		System.out.println("data inserted succesfully");
	}

}
