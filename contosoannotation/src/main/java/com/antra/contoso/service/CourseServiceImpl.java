package com.antra.contoso.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antra.contoso.dao.CourseDao;
import com.antra.contoso.domain.Course;

@Service("courseSerice")
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public void saveCourse(Course course) {
		courseDao.saveCourse(course);

	}

	@Override
	public List<Course> findAllCourses() {
		List<Course> courseList = courseDao.findAllCourses();
		return courseList;
	}

	@Override
	public void deleteCourseById(int courseId) {
		courseDao.deleteCourseById(courseId);
	}

}
