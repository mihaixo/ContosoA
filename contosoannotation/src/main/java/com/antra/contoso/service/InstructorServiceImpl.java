package com.antra.contoso.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antra.contoso.dao.InstructorDAO;
import com.antra.contoso.domain.Instructor;

@Service("instructorService")
@Transactional

public class InstructorServiceImpl implements InstructorService {

	@Autowired
	private InstructorDAO instructorDao;
	
	@Override
	public void saveInstructor(Instructor instructor) {
		instructorDao.saveInstructor(instructor);

	}

	@Override
	public List<Instructor> findAllInstructors() {
		List<Instructor> instructorList = instructorDao.findAllInstructors();
		return instructorList;
	}

	@Override
	public void deleteInstructorById(int instructorId) {
		instructorDao.deleteInstructorById(instructorId);
	}

}
