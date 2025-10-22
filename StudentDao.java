package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {

	  private HibernateTemplate hibernateTemp;
	  
	  public HibernateTemplate getHibernateTemp() {
		return hibernateTemp;
	}

	  public void setHibernateTemp(HibernateTemplate hibernateTemp) {
		  this.hibernateTemp = hibernateTemp;
	  }

	  //save student
	  @Transactional
	  public int insert(Student student)
	  {
		  //insert
		 int i=(int) this.hibernateTemp.save(student); 
		// System.out.println(i);
		  return i;
	  }
	  //insert the multiple students.
	  @Transactional
	  public void insertAll(List<Student> students1)
	  {
		  for(Student s:students1)
			  {
			 this.hibernateTemp.save(s);
		  }
	  }  
	  //get the single data
	  @Transactional
	  public Student getStudent(int StudentId)
	  {
		  Student s=this.hibernateTemp.get(Student.class,StudentId);
		  return s;
	  }
	  //get the multiple data(all rows/all students
	  @Transactional
	  public List<Student> getAllStudents()
	  {
		 List<Student> s1= this.hibernateTemp.loadAll(Student.class);
		  return s1;
	  }
	  // delete the data and basically this method return nothing.
	 @Transactional
	  public void delete(int studentId)
	  {
		  Student s3=this.hibernateTemp.get(Student.class,studentId);
		  this.hibernateTemp.delete(s3);
	  }
	  //update the data and this methods also return nothing.
	 @Transactional 
	 public void update(Student student)
	  {
		  this.hibernateTemp.update(student);
	  }
}
