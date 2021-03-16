package com.maddy.entity;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
=======
>>>>>>> b4bf349 (Uploading the latest working version with validation included)
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD

@Entity
=======
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
>>>>>>> b4bf349 (Uploading the latest working version with validation included)
public class Student {
	
	@Id
	@Column(name="studentid", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	
	@Column(name="firstname")
<<<<<<< HEAD
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="gradeyear")
	private int gradeYear;
	
	@Column(name="course")
	private String course;
	
	@Column(name="tuitionbalance")
	private double tuitionBalance;
=======
	@Size(min = 1, max = 20, message = "First name cannot be empty")
	private String firstName;
	
	@Column(name="lastname")
	@Size(min = 1, max = 20, message = "Last name cannot be empty")
	private String lastName;
	
	@Column(name="gradeyear")
	@NotNull(message = "Please enter grade year in this format: XXXX")
	@Min(4)
	private Integer gradeYear;
	
	@Column(name="course")
	@Size(min = 1, max = 15, message = "Course cannot be empty")
	private String course;
	
	@Column(name="tuitionbalance")
	@NotNull(message = "Please enter tuition balance")
	@Min(4)
	private Double tuitionBalance = 0.0;
>>>>>>> b4bf349 (Uploading the latest working version with validation included)
	
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
<<<<<<< HEAD

	public int getGradeYear() {
		return gradeYear;
	}

	public void setGradeYear(int gradeYear) {
		this.gradeYear = gradeYear;
	}
	
=======
	
	public Integer getGradeYear() {
		return gradeYear;
	}

	public void setGradeYear(Integer gradeYear) {
		this.gradeYear = gradeYear;
	}

>>>>>>> b4bf349 (Uploading the latest working version with validation included)
	public String getCourse() {
		return course;
	}

<<<<<<< HEAD

	public void setCourse(String course) {
		this.course = course;
	}


	public double getTuitionBalance() {
		return tuitionBalance;
	}

	public void setTuitionBalance(double tuitionBalance) {
=======
	public void setCourse(String course) {
		this.course = course;
	}
	
	public Double getTuitionBalance() {
		return tuitionBalance;
	}

	public void setTuitionBalance(Double tuitionBalance) {
>>>>>>> b4bf349 (Uploading the latest working version with validation included)
		this.tuitionBalance = tuitionBalance;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gradeYear=" + gradeYear + ", course=" + course + ", tuitionBalance=" + tuitionBalance + "]";
	}

	
	
	
	
	

}
