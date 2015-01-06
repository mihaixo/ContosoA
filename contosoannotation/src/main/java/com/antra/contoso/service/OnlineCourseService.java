package com.antra.contoso.service;

import java.util.List;

import com.antra.contoso.domain.OnlineCourse;

public interface OnlineCourseService {
	
	void saveInlineCourse(OnlineCourse onlineCourse);
	
	List<OnlineCourse> findAllOnlineCourses();
	
	void deleteOnlineCourseById(int onlineCourseId);

}
