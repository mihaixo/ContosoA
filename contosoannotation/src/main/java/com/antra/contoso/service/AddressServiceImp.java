package com.antra.contoso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antra.contoso.dao.AddressDAO;
import com.antra.contoso.domain.Address;

@Service("addressService")
@Transactional
public class AddressServiceImp implements AddressService 
{
	@Autowired
	private AddressDAO addressDao;

	@Override
	public void saveAddress(Address address) 
	{
		addressDao.saveAddress(address);
	}

	@Override
	public List<Address> findAllAddress() 
	{
		List<Address> lis= addressDao.findAllAddresses();
		return lis;
	}

	@Override
	public void deleteAddressById(int addressId) 
	{	
		addressDao.deleteAddressById(addressId);
	}
}
