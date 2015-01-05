package com.antra.contoso.domain;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
	
	@Test
	public void testFullName()
	{
		String expected = "Mahesh, kambam";
		
		Student s = new Student();
		s.setFirstName("Mahesh");
		s.setLastName("kambam");
		
		String result = s.getFullName();
		
		Assert.assertEquals(expected, result);
		
	}

}
