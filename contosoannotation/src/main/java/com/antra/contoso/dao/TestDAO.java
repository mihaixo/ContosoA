package com.antra.contoso.dao;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antra.contoso.domain.*;

@Service
@Transactional
public class TestDAO {

	
	@Autowired
	AddressDAO address;
	@Autowired
	StudentDAO student;
	@Autowired
	AdministratorDAO administrator;
	@Autowired
	DepartmentDAO department;
	@Autowired
	InstructorDAO instructor;
	@Autowired
	CourseDAO course;
	@Autowired
	EnrollmentDAO enrollment;
	@Autowired
	OnlineCourseDAO onlineCourse;
	@Autowired
	OnsiteCourseDAO onsiteCourse;
	@Autowired
	RoleDAO role;
	@Autowired
	UserDAO user;
	public TestDAO()
	{
		
	}
	
	public void run()
	{
		Address add= new Address();
		add.setCity("Sterling");
		add.setCountry("USA");
		add.setStreet("VA");
		add.setZipCode(22345);
		//AddressDAO address=new AddressDAOImp();
		address.saveAddress(add);
		
		Student stu = new Student();
		stu.setAddress(add);
		stu.setEnrollmentDate(new Date());
		stu.setFirstName("Mihai");
		stu.setLastName("Oprea");
		//StudentDAO student= new StudentDAOImp();
		student.saveStudent(stu);
		
		Administrator admin = new Administrator();
		admin.setFirstName("Bob");
		admin.setLastName("Jhones");
		//AdministratorDAO administrator= new AdministratorDAOImp();
		administrator.saveAdministrator(admin);
		
		Department dep= new Department();
		dep.setAdministratorId(admin);
		dep.setName("Engeneering");
		dep.setStartDate(new Date());
		dep.setBudget(2000.00);
		//DepartmentDAO department= new DepartmentDAOImp();
		department.saveDepartment(dep);
		
		Instructor inst = new Instructor();
		inst.setFirstName("John");
		inst.setLastName("Smith");
		inst.setGender('m');
		inst.setHireDate(new Date());
		inst.setPhotoBlob(null);
		//InstructorDAO instructor = new InstructorDAOImp();
		instructor.saveInstructor(inst);
		
		Course co=new Course();
		co.setCourseDescription("math");
		co.setCourseName("calc 101");
		co.setCredits(3);
		co.setDepartment(dep);
		co.setInstructor(inst);
		//CourseDAO course = new CourseDAOImp();
		course.saveCourse(co);

		Enrollment enr= new Enrollment();
		enr.setCourse(co);
		enr.setGrade(5.3);
		enr.setStudent(stu);
		//EnrollmentDAO enrollment = new EnrollmentDAOImp();
		enrollment.saveEnrollment(enr);
		
		OnlineCourse onl= new OnlineCourse();
		onl.setCourse(co);
		onl.setUrl("www.school.com/calc101");
		//OnlineCourseDAO onlineCourse= new OnlineCourseDAOImp();
		onlineCourse.saveOnlineCourse(onl);
		
		OnsiteCourse ons = new OnsiteCourse();
		ons.setCourse(co);
		ons.setDays("mon/fri");
		ons.setLocation("building A");
		ons.setTime(new Time(12, 12, 12));
		//OnsiteCourseDAO onsiteCourse= new OnsiteCourseDAOImp();
		onsiteCourse.saveOnsiteCourse(ons);
		
		Role ro= new Role();
		ro.setDescription("just a student");
		ro.setRoleName("Student");
		//RoleDao role=new RoleDaoImpl();
		role.saveRole(ro);
		
		User us= new User();
		us.setCreatedDate(new Date());
		us.setEmail("mihai@email.com");
		us.setLastLoginDate(new Date());
		us.setLastPasswordChange(new Date());
		us.setPasswordHash("sdgfasdfsdf");
		us.setPasswordSalt("sadfsdf");
		us.setUserName("mihaio");
		//UserDAO user = new UserDAOImp();
		user.saveUser(us);
		
		System.out.println("hello i am running test!!");
		
		Criteria criteria = getSession().createCriteria(Address.class);
		List<Address> lis =criteria.list();
		
		for(int i=0; i<lis.size();i++)
		{
			Address a=lis.get(i);
			System.out.print("Address: ");
			System.out.println(a.getAddressId());
			System.out.println(a.getCity());
			System.out.println(a.getCountry());
			System.out.println(a.getStreet());
			System.out.println(a.getZipCode());
					
		}
		
		Criteria criteria2 = getSession().createCriteria(Administrator.class);
		List<Administrator> lis2 =criteria2.list();
		for(int i=0; i<lis2.size();i++)
		{
			Administrator ad=lis2.get(i);
			System.out.print("Administrator: ");
			System.out.println(ad.getAdministratorID());
			System.out.println(ad.getFirstName());
			System.out.println(ad.getLastName());
					
		}
		
		Criteria criteria3 = getSession().createCriteria(Course.class);
		List<Course> lis3 =criteria3.list();
		for(int i=0; i<lis2.size();i++)
		{
			Course a=lis3.get(i);
			System.out.print("Course: ");
			System.out.println(a.getCourseId());
			System.out.println(a.getCourseName());
			System.out.println(a.getCourseDescription());
			System.out.println(a.getDepartment());
			System.out.println(a.getInstructor());
			System.out.println();
			System.out.println();
			System.out.println();
					
		}
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		return session;
	}

}
