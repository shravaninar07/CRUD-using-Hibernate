package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Fitness;

public class GymUpdateMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Fitness.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		int myId=3;
		Fitness fitness=ss.get(Fitness.class, myId);
		fitness.setName("Summer");
		fitness.setWeight(50.9f);
		fitness.setMobileno(8987898789l);
		fitness.setAddress("Pune");
		ss.merge(fitness);
		tr.commit();
		ss.close();
		System.out.println("Data updated succesfully");
		
	}

}
