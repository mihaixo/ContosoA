package com.antra.contoso.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.antra.contoso.domain.Instructor;
import com.antra.contoso.domain.Role;


@Repository("InstructorDao")
public class InstructorDAOImp implements InstructorDAO 
{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() 
	{
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	
	@Override
	public void saveInstructor(Instructor instructor) 
	{
		getSession().persist(instructor);
	}

	@Override
	public List<Instructor> findAllInstructors() 
	{
		Criteria criteria = getSession().createCriteria(Instructor.class);
		return (List<Instructor>) criteria.list();
	}

	@Override
	public void deleteInstructorById(int instructorId) 
	{
		Query query = getSession().createSQLQuery("delete from INSTRUCTOR where instructor_id = :id");
		query.setInteger("id", instructorId);
		query.executeUpdate();

	}

}
