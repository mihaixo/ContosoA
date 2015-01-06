package com.antra.contoso.service;

import java.util.List;

import com.antra.contoso.domain.Department;

public interface DepartmentService {
	
	void saveDepartment (Department department);
	
	List<Department> findAlldepartments();
	
	void deleteDepartmentByid(int departmentId);

}
