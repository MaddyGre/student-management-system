package com.maddy.entity;


import java.util.ArrayList;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
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



	public void setGradeYear(int gradeYear) {
		this.gradeYear = gradeYear;
	}
	

	
	public Integer getGradeYear() {
		return gradeYear;
	}

	public void setGradeYear(Integer gradeYear) {
		this.gradeYear = gradeYear;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}
	
	public Double getTuitionBalance() {
		return tuitionBalance;
	}

	public void setTuitionBalance(Double tuitionBalance) {

		this.tuitionBalance = tuitionBalance;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gradeYear=" + gradeYear + ", course=" + course + ", tuitionBalance=" + tuitionBalance + "]";
	}
	

}
