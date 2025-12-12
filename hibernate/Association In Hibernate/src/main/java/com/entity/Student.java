package com.entity;

// useless imports are commented
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;

@Entity // Tells Hibernate to treat this class as a database table.
public class Student {
	
	@Id // Marks this field as the Primary Key.
//	@GeneratedValue(strategy = GenerationType.IDENTITY)		- commented this line because we manually inserting the id's here in app.java
	private int rollno;
	private String name;
	private int marks;
	
//	@OneToOne     // LOGIC: One-to-One. If active, one student row maps to exactly one laptop row.
//	private Laptop laptop;
	
//	@OneToMany(mappedBy="student")     
	// LOGIC: One-to-Many. One student has many laptops.
	// 'mappedBy="student"' tells Hibernate: "Do not create a new table for this relationship. 
	// Go look at the 'student' field in the Laptop class to find the Foreign Key."
	// If we removed 'mappedBy', Hibernate would create a separate Join Table (Student_Laptop).
//	private List<Laptop> laptoplist = new ArrayList<Laptop>();
	
	@ManyToMany(mappedBy="student")     
	// LOGIC: Many-to-Many. Many students can own Many laptops.
	// 'mappedBy="student"' makes this the "Inverse Side" (Passive).
	// It means the Student class is NOT responsible for managing the database link.
	// Hibernate will ignore changes made ONLY to this list when saving to the DB.
	private List<Laptop> laptoplist = new ArrayList<Laptop>();
	
	public List<Laptop> getLaptop() {
		return laptoplist;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptoplist = laptop;
	}


	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
}