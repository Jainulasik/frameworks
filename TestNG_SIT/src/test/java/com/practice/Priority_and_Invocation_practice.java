package com.practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass_pract;
import com.github.dockerjava.api.model.Driver;

public class Priority_and_Invocation_practice extends Baseclass_pract{


	 WebDriver driver;


	@BeforeSuite                                            // if @Beforesuite use ,will execure asky order . If @Test use unlogicaly runing
	public void browser() {
		//implicitwait(5);
		driver = Browser_launch("chrome");
	}


	@Test(priority = -1500,invocationCount = 10)
	public void googlelaunch() {
		url_launch("https://www.google.com");
	}

	@Test(priority = -700)
	public void Amazonlaunch() {
		url_launch("https://www.amazon.com");
	}

	@Test(priority = -1200,invocationCount = 3)
	public void facebooklaunch() {
		url_launch("https://www.facebook.com");
	}


	@Test(priority = -900)
	public void meesholaunch() {

		url_launch("https://www.meesho.com");
	}
	
	

    @AfterSuite
	public void quit() {
		quitbrowser();
	}










}
