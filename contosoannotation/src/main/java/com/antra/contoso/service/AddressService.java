package com.antra.contoso.service;

import java.util.List;

import com.antra.contoso.domain.Address;

public interface AddressService {
	
	void saveAddress(Address address);
	
	List<Address> findAllAddress();
	
	void deleteAddressById(int addressId);

}
