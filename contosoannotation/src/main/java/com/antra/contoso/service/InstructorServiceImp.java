package com.antra.contoso.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antra.contoso.domain.Role;


@Service("InstructorService")
@Transactional
public class InstructorServiceImp implements InstructorService 
{
	//@Service("roleService")
	//@Transactional

	@Override
	public void saveRole(Role role) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public List<Role> findAllRoles() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRoleById(int roleId) 
	{
		// TODO Auto-generated method stub

	}

}
