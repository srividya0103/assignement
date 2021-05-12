package com.college.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.college.beans.Student;

public class MainClass {

	public static void main(String[] args) {
		
	
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-factory.xml");
		Student student = (Student)spring.getBean("student2");
		student.setStudentName("harshi");
		System.out.println(student.getStudentName());
		
		student = (Student)spring.getBean("student2");
		System.out.println(student.getStudentName());
		System.out.println(student.getMarks());
		System.out.println(student.getCourse().getFaculty());
		System.out.println(student.getAddress().getCity());
	}

}
