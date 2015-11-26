package com.lromo.project.testng.services.email;

import org.springframework.stereotype.Service;

@Service
public class EmailGenerator implements IEmailGenerator {
	
	public String getEmail(){
		return "myemail@mycompany.com";
	}
}
