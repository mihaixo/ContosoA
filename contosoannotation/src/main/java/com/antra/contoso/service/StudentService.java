package com.antra.contoso.service;

import java.util.List;

import com.antra.contoso.domain.Student;

public interface StudentService 
{
	void saveStudent(Student student);
	
	List<Student> findAllStudent();
	
	void deleteStudentById(int studentId);

}
