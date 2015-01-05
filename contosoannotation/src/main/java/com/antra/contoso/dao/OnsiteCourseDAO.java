package com.antra.contoso.dao;

import java.util.List;

import com.antra.contoso.domain.OnsiteCourse;

public interface OnsiteCourseDAO 
{
	void saveOnsiteCourse(OnsiteCourse onsiteCourse);
	
	List<OnsiteCourse> findAllOnsiteCourses();
	
	void deleteOnsiteCourseById(int onsiteCourseId);

}
