package com.antra.contoso.service;

import java.util.List;

import com.antra.contoso.domain.Enrollment;

public interface EnrollmentService {
	
	void saveEnrollment(Enrollment enrollment);
	
	List<Enrollment> findAllEnrollments();
	
	void deleteEnrollmentById(int enrollmentId);

}
