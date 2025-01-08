package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Ngo;

public class NgoUpdateMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Ngo.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Ngo ngo=ss.get(Ngo.class,2);
		ngo.setAge(10);
		ss.merge(ngo);
		tr.commit();
		ss.close();
		System.out.println("data updated successfully");
	}

}
