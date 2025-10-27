package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class InsertData {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory(); 
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Student s = new Student();
		s.setName("ram");
		s.setAddress("pune");
		s.setAge(18);
		
		// ss.save(s);  - outdated, used to store object
		ss.persist(s);
		
		System.out.println("Data is inserted...");
		
		tr.commit();
		ss.close();
		
	}

}
