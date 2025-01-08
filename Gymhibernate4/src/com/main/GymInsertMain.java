package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Fitness;

public class GymInsertMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Fitness.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Fitness fitness = new Fitness();
		fitness.setName("Parth");
		fitness.setWeight(65f);
		fitness.setAddress("Mumbai");
		fitness.setMobileno(9999999999l);
		ss.persist(fitness);
		
		Fitness fitness1 = new Fitness();
		fitness1.setName("vani");
		fitness1.setWeight(50f);
		fitness1.setAddress("Pune");
		fitness1.setMobileno(7878787878l);
		ss.persist(fitness1);
		tr.commit();
		ss.close();
		
		
		

	}

}
