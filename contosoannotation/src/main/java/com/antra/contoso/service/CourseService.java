package com.antra.contoso.service;

import java.util.List;
import com.antra.contoso.domain.Course;

public interface CourseService {
	
	void saveCourse (Course course);
	
	List<Course> findAllCourses();
	
	void deleteCourseById(int courseId);

}
