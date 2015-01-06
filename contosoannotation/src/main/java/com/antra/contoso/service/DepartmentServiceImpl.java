package com.antra.contoso.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antra.contoso.dao.DepartmentDAO;
import com.antra.contoso.domain.Department;

@Service("departmentSerive")
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO departmentDao;
	
	@Override
	public void saveDepartment(Department department) {
		departmentDao.saveDepartment(department);

	}

	@Override
	public List<Department> findAllDepartments() {
		List<Department> departmentList = departmentDao.findAllDepartments();
		return departmentList;
	}

	@Override
	public void deleteDepartmentById(int departmentId) {
		departmentDao.deleteDepartmentById(departmentId);
	}

}
