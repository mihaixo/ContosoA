package com.antra.contoso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antra.contoso.dao.RoleDAO;
import com.antra.contoso.domain.Role;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleDAO roleDao;
	
	@Override
	public void saveRole(Role role) {
		roleDao.saveRole(role);
		
	}

	@Override
	public List<Role> findAllRoles() {
		List<Role> roleList = roleDao.findAllRoles();
		return roleList;
	}

	@Override
	public void deleteRoleById(int roleId) {
		roleDao.deleteRoleById(roleId);
		
	}

}
