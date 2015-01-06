package com.antra.contoso.service;

import com.antra.contoso.domain.Student;
import java.util.List;

public interface StudentService {
	
	void saveStudent(Student student);
	
	List<Student> findAllStudents();
	
	int deleteStudentById(int studentId);

}
