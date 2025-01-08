package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Fitness;

public class GymDeleteMain {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Fitness.class);
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		int myId=4;
		Fitness fitness=ss.get(Fitness.class, myId);
		ss.remove(fitness);
		tr.commit();
		ss.close();
		System.out.println("Data Deleted Successfully");
	}

}
