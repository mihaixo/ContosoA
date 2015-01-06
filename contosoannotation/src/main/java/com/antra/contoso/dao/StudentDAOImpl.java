package com.antra.contoso.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.antra.contoso.domain.Role;
import com.antra.contoso.domain.Student;

@Repository("studentDao")
public class StudentDAOImpl implements StudentDAO 
{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	
	@Override
	public void saveStudent(Student student) 
	{
		getSession().persist(student);
	}

	@Override
	public List<Student> findAllStudent() 
	{
		Criteria criteria = getSession().createCriteria(Student.class);
		return (List<Student>) criteria.list();
	}

	@Override
	public void deleteStudentById(int studentId) 
	{
		Query query = getSession().createSQLQuery("delete from STUDENT where STUDENT_ID = :id");
		query.setInteger("id", studentId);
		query.executeUpdate();
	}
}
