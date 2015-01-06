package com.antra.contoso.service;

import java.util.List;

import com.antra.contoso.domain.Instructor;

public interface InstructorService {
	
	void saveInstructor(Instructor instructor);
	
	List<Instructor> findAllInstructors();
	
	void deleteInstructorById(int instructorid);

}
