package com.antra.contoso.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.antra.contoso.domain.Role;

@Repository("roleDao")
public class RoleDaoImpl implements RoleDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	
	@Override
	public void saveRole(Role role) {
		getSession().persist(role);

	}

	@Override
	public List<Role> findAllRoles() {
		Criteria criteria = getSession().createCriteria(Role.class);
		return (List<Role>) criteria.list();
	}

	@Override
	public void deleteRoleById(int roleId) {
		Query query = getSession().createSQLQuery("delete from ROLE where role_id = :id");
		query.setInteger("id", roleId);
		query.executeUpdate();
		//getSession().delete(getSession().get(Role.class, roleId));

	}

}
