package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("config.xml");
		StudentDao sd= con.getBean("studentDao",StudentDao.class);
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
		while(go)
		{
			System.out.println("press 1 for add new student");
			System.out.println("press 2 for get detail of single student");
			System.out.println("press 3 for get detail of all students");
			System.out.println("press 4 for delete student");
			System.out.println("press 5 for update student");
			System.out.println("press 6 for exit");
			try {
				
				int input =Integer.parseInt(br.readLine());
				switch(input)
				{
				case 1:
					//add the new student
					
					//getting the student id.
					System.out.println("enter the studentId");
					int sId=Integer.parseInt(br.readLine());
					
					//getting the student name.
					System.out.println("enter the studentName");
					String sName=br.readLine();
					
					//getting the student city.
					System.out.println("enter the student city");
					String sCity=br.readLine();
					
					//creating the student object
					Student s1=new Student();
					s1.setStudent_Id(sId);
					s1.setStudent_Name(sName);
					s1.setStudent_City(sCity);
					
					//saving the student data.
					int r= sd.insert(s1);
					System.out.println(r +"student added");
					System.out.println("******************************************");
					break;
				case 2:
					//display all students
					List<Student> studentList=sd.getAllStudents();
					for(Student st:studentList)
					{
						System.out.println(st);
					}
					System.out.println("******************************************");
					
					break;
				case 3:
					//get the details of the single student.
					System.out.println("enter the studentId to be searched");
					int studentId=Integer.parseInt(br.readLine());
					Student s2=sd.getStudent(studentId);
					System.out.println(s2);
					System.out.println("********************************************");
					break;
				case 4:
					//delete the student
					System.out.println("enter the student id to be deleted");
					int id=Integer.parseInt(br.readLine());
					sd.delete(id);
					System.out.println("the record deleted");
					System.out.println("*********************************************");
					break;
				case 5:
					//update the student
					System.out.println("enter the studentId to be updated");
					int updateId=Integer.parseInt(br.readLine());
					Student existId=sd.getStudent(updateId);
					System.out.println("enter the new name(press enter to skip)");
					String name=br.readLine();
					if(!name.isEmpty()){
						existId.setStudent_Name(name);
					}
					System.out.println("enter the new city(press enter to skip)");
					String city=br.readLine();
					if(!city.isEmpty())
					{
						existId.setStudent_City(city);
					}
					
					sd.update(existId);
					System.out.println("data got updated");
					System.out.println("*********************************************");	
					break;
				case 6:
					//exit
					go=false;
					break;
				}
				
				
			}
			catch(Exception e) {
				//System.out.println("entered the invalid input enter the another one!");
				System.out.println(e.getMessage());
			}
		}
	}
}
