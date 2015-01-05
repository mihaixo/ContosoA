package com.antra.contoso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antra.contoso.dao.StudentDAO;
import com.antra.contoso.domain.Student;

@Service("studentService")
@Transactional
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentDAO studentDao;
	
	@Override
	public void saveStudent(Student student) 
	{
		studentDao.saveStudent(student);
	}

	@Override
	public List<Student> findAllStudent() 
	{
		List<Student> lis= studentDao.findAllStudent();
		return lis;
	}

	@Override
	public void deleteStudentById(int studentId) 
	{
		studentDao.deleteStudentById(studentId);
	}

}
