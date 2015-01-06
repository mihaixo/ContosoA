package com.antra.contoso.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antra.contoso.dao.OnlineCourseDAO;
import com.antra.contoso.domain.OnlineCourse;

@Service("onlinecourseService")
@Transactional
public class OnlineCourseServiceImpl implements OnlineCourseService {

	@Autowired
	private OnlineCourseDAO onlineCourseDao;
	
	@Override
	public void saveOnlineCourse(OnlineCourse onlineCourse) {
		onlineCourseDao.saveOnlineCourse(onlineCourse);

	}

	@Override
	public List<OnlineCourse> findAllOnlineCourses() {
		List<OnlineCourse> onlineCourseList = onlineCourseDao.findAllOnlineCourses();
		return onlineCourseList;
	}

	@Override
	public void deleteOnlineCourseById(int onlineCourseId) {
		onlineCourseDao.deleteOnlineCourseById(onlineCourseId);
	}

}
