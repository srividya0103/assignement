package com.college.beans;

public class Courses {
	private int courseId;
	private String faculty;
	private int hrs;

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Courses(int courseId, String faculty, int hrs) {
		super();
		this.courseId = courseId;
		this.faculty = faculty;
		this.hrs = hrs;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", faculty=" + faculty + ", hrs=" + hrs + "]";
	}

}
