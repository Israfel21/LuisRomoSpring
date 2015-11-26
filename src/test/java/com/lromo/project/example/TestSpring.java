package com.lromo.project.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import org.testng.Assert;


import com.lromo.project.testng.services.email.EmailNumerator;
import com.lromo.project.testng.services.email.IEmailGenerator;

@Test
@ContextConfiguration({ "/TestSpring-context.xml" })
public class TestSpring extends AbstractTestNGSpringContextTests{
	
	@Autowired
	private IEmailGenerator emailGenerator;
	
	@Autowired
	private EmailNumerator emailNum;
	
	@Test
	void testEmailGenerator(){
		String email = emailGenerator.getEmail();
		
		Assert.assertNotNull(email);
		Assert.assertEquals(email, "myemail@mycompany.com");
	}
	
	@Test
	void testEmailNumerator(){
		int num = emailNum.emailNumber();
		
		Assert.assertEquals(num, 4);
	}

}
