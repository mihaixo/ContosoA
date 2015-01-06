package com.antra.contoso.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antra.contoso.dao.AdministratorDao;
import com.antra.contoso.domain.Administrator;


@Service("administratorService")
@Transactional
public class AdministratorServiceImpl implements AdministratorService {

	@Autowired
	private AdministratorDao administratorDao;
	
	@Override
	public void saveAdministrator(Administrator administrator) {
		administratorDao.saveAdministrator(administrator);

	}

	@Override
	public List<Administrator> findAllAdministrators() {
		List<Administrator> administratorList = administratorDao.findAllAdministrators();
		return administratorList;
	}

	@Override
	public void deleteAdministratorById(int administratorId) {
		administratorDao.deleteAdministratorsById(administratorId);

	}

}
