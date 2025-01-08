package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Ngo;

public class NgoDeleteMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Ngo.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		int myId=3;
		Ngo ngo=ss.get(Ngo.class, myId);
		ss.remove(ngo);
		tr.commit();
		ss.close();
		System.out.println("Data deleted succesfully");
	}

}
