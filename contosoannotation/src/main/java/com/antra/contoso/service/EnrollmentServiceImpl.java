package com.antra.contoso.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antra.contoso.dao.EnrollmentDAO;
import com.antra.contoso.domain.Enrollment;

@Service("enrollmentService")
@Transactional
public class EnrollmentServiceImpl implements EnrollmentService {

	@Autowired
	private EnrollmentDAO enrollmentDao;
	@Override
	public void saveEnrollment(Enrollment enrollment) {		
		enrollmentDao.saveEnrollment(enrollment);
	}

	@Override
	public List<Enrollment> findAllEnrollments() {
		List<Enrollment> enrollmentList = enrollmentDao.findAllEnrollments();
		return enrollmentList;
	}

	@Override
	public void deleteEnrollmentById(int enrollmentId) {
		enrollmentDao.deleteEnrollmentById(enrollmentId);
	}

}
