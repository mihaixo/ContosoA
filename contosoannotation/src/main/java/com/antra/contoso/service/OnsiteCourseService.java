package com.antra.contoso.service;

import java.util.List;

import com.antra.contoso.domain.OnsiteCourse;

public interface OnsiteCourseService {
	
	void saveOnsiteCourse(OnsiteCourse onsiteCourse);
	
	List<OnsiteCourse> findAllOnsiteCourses();
	
	void deleteOnsiteCourseById(int onsiteCourseId);

}
