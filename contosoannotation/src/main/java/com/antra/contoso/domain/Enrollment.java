package com.antra.contoso.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ENROLLMENT")
public class Enrollment {
	@Id
	@Column(name="ENROLLMENT_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int enrollmentId;

	@ManyToOne
	@JoinColumn(name="COURSE_ID")
	private Course course;
	
	@ManyToOne
	@JoinColumn(name="STUDENT_ID")
	private Student student;
	
	@Column(name="GRADE")
	private double grade;

	public int getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	

}
