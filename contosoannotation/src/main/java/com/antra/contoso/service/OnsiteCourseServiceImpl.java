package com.antra.contoso.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antra.contoso.dao.OnsiteCourseDao;
import com.antra.contoso.domain.OnsiteCourse;

@Service("onsiteCourseSerice")
@Transactional
public class OnsiteCourseServiceImpl implements OnsiteCourseService {

	@Autowired
	private OnsiteCourseDao onsiteCourseDao;
	
	@Override
	public void saveOnsiteCourse(OnsiteCourse onsiteCourse) {
		onsiteCourseDao.saveOnsiteCourse(onsiteCourse);
	}

	@Override
	public List<OnsiteCourse> findAllOnsiteCourses() {
		List<OnsiteCourse> onsiteCourseList = onsiteCourseDao.findAllOnsiteCourses();
		return onsiteCourseList;
	}

	@Override
	public void deleteOnsiteCourseById(int onsiteCourseId) {
		onsiteCourseDao.deleteOnsiteCoursesById(onsiteCourseId);

	}

}
