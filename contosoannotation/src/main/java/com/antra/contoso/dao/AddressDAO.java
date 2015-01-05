package com.antra.contoso.dao;

import java.util.List;

import com.antra.contoso.domain.Address;

public interface AddressDAO 
{
	void saveAddress(Address address);
	
	List<Address> findAllAddresses();
	
	void deleteAddressById(int addressId);

}
