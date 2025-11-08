package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Student;

public class GetSingleRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		// SQL - select * from student where id=2;
		// HQL - from Student where id =: id; - here we used prepared statement in HQL

		
// Deleting record from the the database using HQL
// Remove the result type from the createQuery method for DELETE operations, because DELETE operations don't return results.
//		   String hqlQuery = "delete from Student where stud_id=:stud_id";
//		   Query<?> query = ss.createQuery(hqlQuery);
//		   query.setParameter("stud_id", 2);
//		   query.executeUpdate();
//		   System.out.println("Data is deleted...");
		   


// note - here we take Query reference present in org.hibernate
		String hqlQuery = "from Student where stud_id =: stud_id";
		Query<Student> query = ss.createQuery(hqlQuery, Student.class);
		query.setParameter("stud_id", 2);
		Student s = query.getSingleResult();
		System.out.println(s);

		tr.commit();
		ss.close();
	}

}
