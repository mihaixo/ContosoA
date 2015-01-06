package com.antra.contoso.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.antra.contoso.domain.Administrator;
import com.antra.contoso.domain.Role;

@Repository
public class AdministratorDAOImpl implements AdministratorDAO 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}

	@Override
	public void saveAdministrator(Administrator administrator) {
		getSession().persist(administrator);

	}

	@Override
	public List<Administrator> findAllAdministrators() {
		Criteria criteria = getSession().createCriteria(Administrator.class);
		return (List<Administrator>) criteria.list();
	}

	@Override
	public void deleteAdministratorById(int AdministratorId) {
		Query query = getSession().createSQLQuery("delete from ADMINISTRATOR where role_id = :id");
		query.setInteger("id", AdministratorId);
		query.executeUpdate();

	}

}
