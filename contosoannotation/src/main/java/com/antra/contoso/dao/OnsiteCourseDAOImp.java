package com.antra.contoso.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.antra.contoso.domain.OnsiteCourse;
import com.antra.contoso.domain.Role;

@Repository
public class OnsiteCourseDAOImp implements OnsiteCourseDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	

	@Override
	public void saveOnsiteCourse(OnsiteCourse onsiteCourse) {
		getSession().persist(onsiteCourse);

	}

	@Override
	public List<OnsiteCourse> findAllOnsiteCourses() {
		Criteria criteria = getSession().createCriteria(OnsiteCourse.class);
		return (List<OnsiteCourse>) criteria.list();
	}

	@Override
	public void deleteOnsiteCourseById(int onsiteCourseId) {
		Query query = getSession().createSQLQuery("delete from ONSITE_COURSE where role_id = :id");
		query.setInteger("id", onsiteCourseId);
		query.executeUpdate();

	}

}
