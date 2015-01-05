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
@Table(name="ONLINE_COURSE")
public class OnlineCourse 
{
	@Id
	@Column(name="ONLINE_COURSE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int onlineCourseID;
	
	@ManyToOne
	@JoinColumn(name="COURSE_ID")
	private Course course;
	
	@Column(name="URL")
	private String url;

	public int getOnlineCourseID() {
		return onlineCourseID;
	}

	public void setOnlineCourseID(int onlineCourseID) {
		this.onlineCourseID = onlineCourseID;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
}
