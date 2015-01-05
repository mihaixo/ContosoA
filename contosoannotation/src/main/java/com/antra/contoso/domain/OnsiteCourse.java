package com.antra.contoso.domain;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="ONSITE_COURSE")
public class OnsiteCourse 
{
	
	@Id
	@Column(name="ONSITE_COURSE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int onsiteCourseID;
	
	@ManyToOne
	@JoinColumn(name="COURSE_ID")
	private Course course;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="DAYS")
	private String days;
	
	@Column(name="TIME")
	//type mapping like date
	private Time time;

	public int getOnsiteCourseID() {
		return onsiteCourseID;
	}

	public void setOnsiteCourseID(int onsiteCourseID) {
		this.onsiteCourseID = onsiteCourseID;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	
}
