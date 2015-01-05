package com.antra.contoso.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student 
{
	@Id
	@Column(name="STUDENT_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentID;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="ENROLLMENT_DATE")
	private Date enrollmentDate = new Date();
	
	@OneToOne
	@JoinColumn(name="HOME_ADDRESS_ID")
	private Address address;
	
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Date getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getFullName(){
		String fullName = this.getFirstName()+", "+this.getLastName();
		return fullName;
	}
	
	
}
