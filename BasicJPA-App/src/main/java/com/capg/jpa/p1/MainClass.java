package com.capg.jpa.p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass obj = new MainClass();
		Configuration cfg = new Configuration();
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();
		
		Courses course1 = obj.getCourses(); // course1
		
		Courses course2 = obj.getCourses(); // course 2
		
		Student student = obj.getStudent(); // student1
		
		Student student1 = obj.getStudent(); // student2
		
		List<Student> studentlist_c1 = new ArrayList<>(); // list of students enrolled in course 1
		studentlist_c1.add(student);
		
		List<Student> studentList_c2 = new ArrayList<>(); // list of students enrolled in course 2
		studentlist_c1.add(student);
		studentlist_c1.add(student1);
		
		List<Courses> list_s1 = new ArrayList<Courses>(); // list of courses student1 has
		list_s1.add(course1); 
		List<Courses> list_s2 = new ArrayList<Courses>(); // list of courses student2 has
		list_s2.add(course1);
		list_s2.add(course2);
		
		course1.setStudentList(studentlist_c1);
		course2.setStudentList(studentList_c2);
		
		student.setCourseList(list_s1);
		student1.setCourseList(list_s2);
		
		Transaction t = session.beginTransaction();
		session.save(course1);
		session.save(course2);
		session.save(student);
		session.save(student1);
		
		t.commit();
		
		System.out.println("Data Saved");
		
		
		
		
		
	}
	public Courses getCourses()
	{
		Courses c = new Courses();
		System.out.println("Enter course id");
		c.setCourseId(new Scanner(System.in).nextLine());
		
		System.out.println("Enter course name");
		c.setCourseName(new Scanner(System.in).nextLine());
		
		System.out.println("Enter Course enrolled count");
		c.setEnrolledCount(new Scanner(System.in).nextInt());
		
		return c;
	}
	
	public Student getStudent() {
		Student student = new Student();
		System.out.println("Enter student name");
		student.setStudentName(new Scanner(System.in).nextLine());
		System.out.println("Enter student id");
		student.setStuId(new Scanner(System.in).nextInt());
		System.out.println("Enter student marks");
		student.setMarks(new Scanner(System.in).nextInt());
		System.out.println("Enter student age");
		student.setAge(new Scanner(System.in).nextInt());
		Certificates certificate = new Certificates("Java", "LB Institute");
		student.setCertificate(certificate);
		
		return student;
	}
}