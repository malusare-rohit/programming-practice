package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentRecord")     // as we know the table name in database is taken from Entity class name. But if we use table annotation and give it a different name it creates the table of that name. in this case the Student table is already present in the database, so Student table remain as it is. it creates new table which has name StudentRecord.
public class Student {
		
		@Id						// to declare the column as primary key
		@GeneratedValue(strategy = GenerationType.IDENTITY)		// to make column Auto increment
		private int stud_id;
		private String name;
		// Column(nullable="true")
		@Column(name="city")	// to set the column name explicitly. otherwise the column name will be same as the field name.
		private String address;
		private int age;
		
		public int getStud_id() {
			return stud_id;
		}
		public void setStud_id(int stud_id) {
			this.stud_id = stud_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		public Student(int stud_id, String name, String city, int age) {
			this.stud_id = stud_id;
			this.name = name;
			this.address = city;
			this.age = age;
		}
		
		public Student() {
		}
		
		@Override
		public String toString() {
			return "Student [stud_id=" + stud_id + ", name=" + name + ", city=" + address + ", age=" + age + "]";
		}
		
		
		

}
