package com.spring.orm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_information")
public class Student {
	@Id
	private int student_Id;
	private String student_Name;
	private String student_City;
	public Student(int student_Id, String student_Name, String student_City) {
		super();
		this.student_Id = student_Id;
		this.student_Name = student_Name;
		this.student_City = student_City;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	@Override
	public String toString() {
		return "Student [student_Id=" + student_Id + ", student_Name=" + student_Name + ", student_City=" + student_City
				+ "]";
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getStudent_City() {
		return student_City;
	}
	public void setStudent_City(String student_City) {
		this.student_City = student_City;
	}
	
	
	
}
