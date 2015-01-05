package com.antra.contoso.dao;

import java.util.List;

import com.antra.contoso.domain.Course;

public interface CourseDAO 
{
	void saveCourse(Course course);
	
	List<Course> findAllCourses();
	
	void deleteCourseById(int courseId);

}
