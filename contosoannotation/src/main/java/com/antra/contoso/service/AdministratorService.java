package com.antra.contoso.service;

import com.antra.contoso.domain.Administrator;
import java.util.List;

public interface AdministratorService {
	
	void saveAdministrator(Administrator administrator);
	
	List<Administrator> findAllAdministrators();
	
	void deleteAdministratorById(int administratorId);

}
