package com.antra.contoso.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.antra.contoso.domain.OnlineCourse;
import com.antra.contoso.domain.Role;

@Repository
public class OnlineCourseDAOImpl implements OnlineCourseDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	
	@Override
	public void saveOnlineCourse(OnlineCourse onlineCourse) {
		getSession().persist(onlineCourse);

	}

	@Override
	public List<OnlineCourse> findAllOnlineCourses() {
		Criteria criteria = getSession().createCriteria(OnlineCourse.class);
		return (List<OnlineCourse>) criteria.list();
	}

	@Override
	public void deleteOnlineCourseById(int onlineCourseId) {
		Query query = getSession().createSQLQuery("delete from ONLINE_COURSE where role_id = :id");
		query.setInteger("id", onlineCourseId);
		query.executeUpdate();

	}

}
