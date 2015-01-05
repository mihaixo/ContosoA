package com.antra.contoso.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.antra.contoso.domain.Address;
import com.antra.contoso.domain.Role;

@Repository("addressDao")
public class AddressDAOImp implements AddressDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	
	@Override
	public void saveAddress(Address address) 
	{
		getSession().persist(address);
	}

	@Override
	public List<Address> findAllAddresses() 
	{
		Criteria criteria = getSession().createCriteria(Address.class);
		return (List<Address>) criteria.list();
	}

	@Override
	public void deleteAddressById(int addressId) 
	{
		Query query = getSession().createSQLQuery("delete from ADDRESS where ADDRESS_ID = :id");
		query.setInteger("id", addressId);
		query.executeUpdate();
	}

}
