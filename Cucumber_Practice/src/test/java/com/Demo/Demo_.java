package com.Demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class Demo_ {
	
	
	@Test
	public void password() {
		System.out.println("type_password");
	}
	
	
    @Before
	public void Url() {
		System.out.println("Launch Url");
	}
    
	@AfterClass
	public void login() {
		System.out.println("Login");
	}

	@After
    public void username() {
		System.out.println("type_usernmae");
	}

	

	



}
