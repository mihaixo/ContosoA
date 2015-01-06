package com.antra.contoso.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antra.contoso.dao.AddressDAO;
import com.antra.contoso.domain.Address;
@Service("addressService")
@Transactional
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressDAO addressDao;

	@Override
	public void saveAddress(Address address) {
		addressDao.saveAddress(address);

	}

	@Override
	public List<Address> findAllAddresses() {
		List<Address> addressList = addressDao.findAllAddresses();
		return addressList;
	}

	@Override
	public void deleteAddressById(int addressId) {
		addressDao.deleteAddressById(addressId);

	}

}
