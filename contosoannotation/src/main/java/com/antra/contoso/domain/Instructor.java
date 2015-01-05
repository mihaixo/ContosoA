package com.antra.contoso.domain;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="INSTRUCTOR")
public class Instructor 
{
	@Id
	@Column(name="INSTRUCTOR_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int instructorID;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="GENDER")
	private char gender;
	
	@Column(name="HIRED_DATE")
	//hybernate type conversion
	private Date hireDate;
	
	@Column(name="PHOTO")
	//hybernate type conversion
	private Blob photoBlob;
	
	public int getInstructorID() {
		return instructorID;
	}
	public void setInstructorID(int instructorID) {
		this.instructorID = instructorID;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Blob getPhotoBlob() {
		return photoBlob;
	}
	public void setPhotoBlob(Blob photoBlob) {
		this.photoBlob = photoBlob;
	}

	
	
}
