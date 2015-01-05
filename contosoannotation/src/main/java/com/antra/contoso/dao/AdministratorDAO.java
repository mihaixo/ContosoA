package com.antra.contoso.dao;

import java.util.List;

import com.antra.contoso.domain.Administrator;

public interface AdministratorDAO 
{
	void saveAdministrator(Administrator administrator);
	
	List<Administrator> findAllAdministrators();
	
	void deleteAdministratorById(int AdministratorId);

}
