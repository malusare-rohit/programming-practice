package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Student;

public class InsertData {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory(); 
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		//SQL : insert into student(age,name,city) values(24,'suraj','pune');
		//HQL : insert into studentrecord(name,city,age) values(:name,:city,:age)
		
		// while doing insertion operation using HQL. We have to pass actual table name from the database instead of the entity(class) name, also for the column.
		String hqlQuery = "insert into studentrecord(name,city,age) values(:name,:city,:age)";
		MutationQuery query = ss.createNativeMutationQuery(hqlQuery);
		query.setParameter("name", "suraj");
		query.setParameter("city", "pune");
		query.setParameter("age", 23);
		query.executeUpdate();

		
//		Student s = new Student();
//		s.setName("ram");
//		s.setAddress("pune");
//		s.setAge(18);
//		
//		// ss.save(s);  - outdated, used to store object
//		ss.persist(s);
		
		System.out.println("Data is inserted...");
		
		tr.commit();
		ss.close();
		
	}

}
