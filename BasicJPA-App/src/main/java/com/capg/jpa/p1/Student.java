package com.capg.jpa.p1;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity   
@Table(name = "StudentTab")
	

public class Student {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "RollNumber")
		private int stuId;
		
		@Column(name=" StudentName")
		private String StudentName;
		
		private int marks;
		private int age;
		
		@ManyToMany(cascade = CascadeType.ALL)
		@JoinTable(
				name = "Student_Courses",
				joinColumns = @JoinColumn(name = "Stu_id"),
				inverseJoinColumns = @JoinColumn(name = "Courses"))
		private List<Courses> courseList;
		
		
		
		
		@Embedded
		@AttributeOverrides({
			@AttributeOverride(name = "certifiacteName", column = @Column(name = "certificate")),
			@AttributeOverride(name = "issuerName", column = @Column(name = "issuer")),
			})
		private Certificates certificate;




		public int getStuId() {
			return stuId;
		}




		public void setStuId(int stuId) {
			this.stuId = stuId;
		}




		public String getStudentName() {
			return StudentName;
		}




		public void setStudentName(String studentName) {
			StudentName = studentName;
		}




		public int getMarks() {
			return marks;
		}




		public void setMarks(int marks) {
			this.marks = marks;
		}




		public int getAge() {
			return age;
		}




		public void setAge(int age) {
			this.age = age;
		}




		public List<Courses> getCourseList() {
			return courseList;
		}




		public void setCourseList(List<Courses> courseList) {
			this.courseList = courseList;
		}




		public Certificates getCertificate() {
			return certificate;
		}




		public void setCertificate(Certificates certificate) {
			this.certificate = certificate;
		}




		public Student(int stuId, String studentName, int marks, int age, List<Courses> courseList,
				Certificates certificate) {
			super();
			this.stuId = stuId;
			StudentName = studentName;
			this.marks = marks;
			this.age = age;
			this.courseList = courseList;
			this.certificate = certificate;
		}




		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}




		@Override
		public String toString() {
			return "Student [stuId=" + stuId + ", StudentName=" + StudentName + ", marks=" + marks + ", age=" + age
					+ ", courseList=" + courseList + ", certificate=" + certificate + "]";
		}
		
		
}