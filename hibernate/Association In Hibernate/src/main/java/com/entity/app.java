package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class app {
	
	public static void main(String[] args) {
		
		// Creating a Laptop object (Transient state - not yet in DB)
		Laptop laptop = new Laptop();
		laptop.setLid(101); // Manually setting ID (requires @GeneratedValue to be disabled or handled carefully)
		laptop.setLname("Dell");
		
		// Creating a Student object
		Student student = new Student();
		student.setRollno(1); // Manually setting ID
		student.setName("Navin");
		student.setMarks(55);
				
//		student.setLaptop(laptop);   - used when we implemented the @OneToOne logic in Student.class
		
		// LOGIC: Updating the Inverse Side (Student)
				// We add the laptop to the student's list. 
				// This keeps the Java objects consistent (if you ask student.getLaptop(), you get the list).
				// BUT, because Student is 'mappedBy', Hibernate ignores this for database saving.
		student.getLaptop().add(laptop);
		
		laptop.getStudent().add(student);  // for the @ManyToMany logic in laptop.class
		// LOGIC: Updating the Owning Side (Laptop) - CRITICAL FOR @ManyToMany
				// Since Laptop.java has the @ManyToMany (without mappedBy), it is the Owner.
				// We MUST add the student to the laptop's list here.
				// This triggers Hibernate to insert a record into the Join Table (Laptop_Student).
		
//		laptop.setStudent(student);		- used when we implemented the @ManyToOne logic in Laptop.class
		// If using @ManyToOne, this line would set the Foreign Key column in the Laptop table.
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		ss.persist(laptop);
		ss.persist(student);
		
		tr.commit();
		ss.close();
	}

}
