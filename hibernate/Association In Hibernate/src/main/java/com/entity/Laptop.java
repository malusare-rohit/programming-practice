package com.entity;

//useless imports are commented
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
//import jakarta.persistence.ManyToOne;

@Entity // Tells Hibernate to treat this class as a database table.
public class Laptop {
	
	@Id // Marks this field as the Primary Key.
//	@GeneratedValue(strategy = GenerationType.IDENTITY)		- commented this line because we manually inserting the id's here
	private int lid;
	private String lname;

//	@ManyToOne					
	// LOGIC: Many-to-One. Many laptops belong to one Student.
	// If active, Hibernate creates a Foreign Key column (e.g., student_rollno) inside the Laptop table.
	// This makes Laptop the "Owner" of the relationship because it holds the physical link (FK).
//	private Student student;
	
	@ManyToMany					
	// LOGIC: Many-to-Many. 
	// Since there is NO 'mappedBy' attribute here, this is the "Owning Side".
	// Hibernate looks at THIS list to determine what to save in the database.
	// Because it's Many-to-Many, Hibernate cannot put a Foreign Key in the Laptop table.
	// Instead, it automatically creates a third "Join Table" (usually Laptop_Student) 
	// to hold the pairs of IDs (lid, rollno).
	private List<Student> student = new ArrayList<Student>();
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
//	public Student getStudent() {					- for @ManyToOne getter
//		return student;
//	}
//	public void setStudent(Student student) {		- for @ManyToOne setter
//		this.student = student;
//	}
	

	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}

}