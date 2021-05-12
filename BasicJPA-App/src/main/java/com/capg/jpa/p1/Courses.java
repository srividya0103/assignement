package com.capg.jpa.p1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Courses")
public class Courses {
	@Id
	private String courseId;
	private String courseName;
	private int enrolledCount;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "Student_Courses",
			joinColumns = @JoinColumn(name = "Courses"),
			inverseJoinColumns = @JoinColumn(name = "Stu_id"))
	private List<Student> studentList;

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getEnrolledCount() {
		return enrolledCount;
	}

	public void setEnrolledCount(int enrolledCount) {
		this.enrolledCount = enrolledCount;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		studentList = studentList;
	}

	public Courses(String courseId, String courseName, int enrolledCount, List<Student> studentList) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.enrolledCount = enrolledCount;
		studentList = studentList;
	}

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	

}