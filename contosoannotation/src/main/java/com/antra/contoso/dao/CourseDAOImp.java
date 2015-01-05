package com.antra.contoso.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.antra.contoso.domain.Course;
import com.antra.contoso.domain.Role;

@Repository
public class CourseDAOImp implements CourseDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}

	@Override
	public void saveCourse(Course course) {
		getSession().persist(course);

	}

	@Override
	public List<Course> findAllCourses() {
		Criteria criteria = getSession().createCriteria(Course.class);
		return (List<Course>) criteria.list();
	}

	@Override
	public void deleteCourseById(int courseId) {
		Query query = getSession().createSQLQuery("delete from COURSE where role_id = :id");
		query.setInteger("id", courseId);
		query.executeUpdate();

	}

}
