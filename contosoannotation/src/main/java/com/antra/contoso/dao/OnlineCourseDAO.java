package com.antra.contoso.dao;

import java.util.List;

import com.antra.contoso.domain.OnlineCourse;

public interface OnlineCourseDAO 
{
	void saveOnlineCourse(OnlineCourse onlineCourse);
	
	List<OnlineCourse> findAllOnlineCourses();
	
	void deleteOnlineCourseById(int onlineCourseId);

}
