package com.antra.contoso.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antra.contoso.dao.StudentDAO;
import com.antra.contoso.domain.Student;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDao;

	@Override
	public void saveStudent(Student student) {
		studentDao.saveStudent(student);
	}

	@Override
	public List<Student> findAllStudents() {
		List<Student> studentList = studentDao.findAllStudents();
		return studentList;
	}

	@Override
	public int deleteStudentById(int studentId) {
		studentDao.deleteStudentById(studentId);
		return 0;
	}

}
