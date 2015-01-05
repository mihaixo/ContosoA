package com.antra.contoso.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.antra.contoso.domain.Role;
import com.antra.contoso.domain.User;

@Repository
public class UserDAOImp implements UserDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	

	@Override
	public void saveUser(User user) {
		getSession().persist(user);

	}

	@Override
	public List<User> findAllUsers() {
		Criteria criteria = getSession().createCriteria(User.class);
		return (List<User>) criteria.list();
	}

	@Override
	public void deleteUserById(int userId) {
		Query query = getSession().createSQLQuery("delete from USER where user_id = :id");
		query.setInteger("id", userId);
		query.executeUpdate();

	}
	public boolean validateLogin(String pass, String uName) 
	{
		Criteria criteria = getSession().createCriteria(User.class);
		List<User> lis =(List<User>) criteria.list();
		
		for(int i=0;i<lis.size();i++)
		{
			if(lis.get(i).getUserName()==uName)
			{
				if(lis.get(i).getPasswordHash()==pass)
				{
					return true;
				}
			}
		}
		return false;
	}

}
