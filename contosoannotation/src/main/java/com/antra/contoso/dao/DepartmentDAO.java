package com.antra.contoso.dao;

import java.util.List;

import com.antra.contoso.domain.Department;

public interface DepartmentDAO 
{
	void saveDepartment(Department department);
	
	List<Department> findAllDepartments();
	
	void deleteDepartmentById(int departmentId);

}
