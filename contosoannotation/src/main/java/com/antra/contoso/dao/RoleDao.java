package com.antra.contoso.dao;

import java.util.List;

import com.antra.contoso.domain.Role;

public interface RoleDao {
	
	void saveRole(Role role);
	
	List<Role> findAllRoles();
	
	void deleteRoleById(int roleId);
}
