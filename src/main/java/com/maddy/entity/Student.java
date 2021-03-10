package com.maddy.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@Column(name="studentid", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="gradeyear")
	private int gradeYear;
	
	@Column(name="course")
	private String course;
	
	@Column(name="tuitionbalance")
	private double tuitionBalance;
	
	public Student() {
	
		
	}


	public Long getStudentId() {
		return studentId;
	}


	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGradeYear() {
		return gradeYear;
	}

	public void setGradeYear(int gradeYear) {
		this.gradeYear = gradeYear;
	}
	
	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public double getTuitionBalance() {
		return tuitionBalance;
	}

	public void setTuitionBalance(double tuitionBalance) {
		this.tuitionBalance = tuitionBalance;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gradeYear=" + gradeYear + ", course=" + course + ", tuitionBalance=" + tuitionBalance + "]";
	}

	
	
	
	
	

}
