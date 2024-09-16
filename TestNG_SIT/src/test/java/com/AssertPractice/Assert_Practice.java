package com.AssertPractice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Baseclass.Baseclass_pract;

public class Assert_Practice extends Baseclass_pract {

	WebDriver driver;

	@Test
	public  void Orangehrm_login() {

		driver = Browser_launch("chrome");
		url_launch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		implicitwait(2);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123"+Keys.ENTER);
		
		System.out.println("Orangehrm -Successfully launched");


	String expectedurl = ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/logi");
	
	String actualurl = driver.getCurrentUrl();

    assertEquals(actualurl, expectedurl);
    
    SoftAssert sa = new SoftAssert();
    
    sa.assertEquals(actualurl, expectedurl);


	}











}
