package com.antra.contoso.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antra.contoso.dao.AddressDao;
import com.antra.contoso.domain.Address;
@Service("addressService")
@Transactional
public class AddressDaoImpl implements AddressService {
	
	@Autowired
	private AddressDao addressDao;

	@Override
	public void saveAddress(Address address) {
		addressDao.saveAddress(address);

	}

	@Override
	public List<Address> findAllAddress() {
		List<Address> addressList = addressDao.findAllAddresses();
		return addressList;
	}

	@Override
	public void deleteAddressById(int addressId) {
		addressDao.deleteAddressById(addressId);

	}

}
