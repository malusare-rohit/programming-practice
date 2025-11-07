package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Student;

public class GetAllRecord {
	
	// here we get all records from the database using HQL
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		//	SQL : Select * from student;  - table name as it is
		//	HQL : from Student	- class name as table name, first letter capital
		
		String hqlQuery = "from Student";
		
		Query<Student> query = ss.createQuery(hqlQuery, Student.class);
//		List<Student> list = query.getResultList();		-	old method
		List<Student> list = query.list();
		
		
		for(Student student : list) {
			System.out.println(student);
		}
	}

}
