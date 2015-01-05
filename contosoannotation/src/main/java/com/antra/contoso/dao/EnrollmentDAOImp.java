package com.antra.contoso.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.antra.contoso.domain.Enrollment;
import com.antra.contoso.domain.Role;

@Repository
public class EnrollmentDAOImp implements EnrollmentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}

	@Override
	public void saveEnrollment(Enrollment enrollment) {
		getSession().persist(enrollment);

	}

	@Override
	public List<Enrollment> findAllEnrollments() {
		Criteria criteria = getSession().createCriteria(Enrollment.class);
		return (List<Enrollment>) criteria.list();
	}

	@Override
	public void deleteEnrollmentById(int enrollmentId) {
		Query query = getSession().createSQLQuery("delete from ENROLLMENT where role_id = :id");
		query.setInteger("id", enrollmentId);
		query.executeUpdate();

	}

}
