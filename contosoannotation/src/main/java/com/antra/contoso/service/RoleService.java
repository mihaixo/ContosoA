package com.antra.contoso.service;

import java.util.List;

import com.antra.contoso.domain.Role;

public interface RoleService {
	
	void saveRole(Role role);
	
	List<Role> findAllRoles();
	
	void deleteRoleById(int roleId);
}
