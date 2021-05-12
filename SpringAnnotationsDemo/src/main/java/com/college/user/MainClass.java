package com.college.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.college.beans.Student;

public class MainClass {

	public static void main(String[] args) {
		
	
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-factory.xml");
		Student student = (Student)spring.getBean("student");
		student.setStudentName("harshi");
		System.out.println(student.getStudentName());
		
		student = (Student)spring.getBean("student");
		System.out.println(student.getRollNumber());
	//	System.out.println(student.getMarks());
		//System.out.println(student.getCourse());
		//System.out.println(student.getAddress());
	}

}
