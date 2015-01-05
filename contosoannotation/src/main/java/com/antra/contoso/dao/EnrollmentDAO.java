package com.antra.contoso.dao;

import java.util.List;

import com.antra.contoso.domain.Enrollment;

public interface EnrollmentDAO 
{
	void saveEnrollment(Enrollment enrollment);
	
	List<Enrollment> findAllEnrollments();
	
	void deleteEnrollmentById(int enrollmentId);

}
