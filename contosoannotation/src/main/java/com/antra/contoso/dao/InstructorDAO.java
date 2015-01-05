package com.antra.contoso.dao;

import java.util.List;

import com.antra.contoso.domain.Instructor;

public interface InstructorDAO 
{
void saveInstructor(Instructor instructor);
	
	List<Instructor> findAllInstructors();
	
	void deleteInstructorById(int instructorId);

}
