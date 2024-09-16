package com.practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass_pract;

public class Practicess extends Baseclass_pract {

	 WebDriver driver;


	@BeforeSuite                                            // if @Beforesuite use ,will execure asky order . If @Test use unlogicaly runing
	public void browser() {
		//implicitwait(5);
		driver = Browser_launch("chrome");
	}


	@Test
	public void googlelaunch() {
		url_launch("https://www.google.com");
	}

	@Test
	public void Amazonlaunch() {
		url_launch("https://www.amazon.com");
	}

	@Test
	public void facebooklaunch() {
		url_launch("https://www.facebook.com");
	}


	@Test
	public void meesholaunch() {

		url_launch("https://www.meesho.com");
	}
	
	

   @AfterSuite
	public void quit() {
		quitbrowser();
	}


}
