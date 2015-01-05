package com.antra.contoso.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.antra.contoso.domain.Department;
import com.antra.contoso.domain.Role;

@Repository
public class DepartmentDAOImp implements DepartmentDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}

	@Override
	public void saveDepartment(Department department) {
		getSession().persist(department);

	}

	@Override
	public List<Department> findAllDepartments() {
		Criteria criteria = getSession().createCriteria(Department.class);
		return (List<Department>) criteria.list();
	}

	@Override
	public void deleteDepartmentById(int departmentId) {
		Query query = getSession().createSQLQuery("delete from DEPARTMENT where role_id = :id");
		query.setInteger("id", departmentId);
		query.executeUpdate();

	}

}
