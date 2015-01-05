package com.antra.contoso.dao;

import java.util.List;

import com.antra.contoso.domain.Student;

public interface StudentDAO 
{
	void saveStudent(Student student);
	
	List<Student> findAllStudent();
	
	void deleteStudentById(int studentId);

}
