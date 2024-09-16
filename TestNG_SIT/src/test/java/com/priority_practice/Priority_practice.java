package com.priority_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass_pract;
import com.pageobjectmanager.Page_Object_manager_Orangehrm;

public  class Priority_practice extends Baseclass_pract{

	public static WebDriver driver;


	@Test(priority = -300)
	public void Urllaunch() {
		url_launch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void Set_up() {
		implicitwait(5);
		driver = Browser_launch("chrome");

	}


	@Test
	public void OrangeHrmlogin() {

		Page_Object_manager_Orangehrm pom = new Page_Object_manager_Orangehrm(driver);
		
		implicitwait(5);

		driver.findElement(By.xpath("//*[@*='username']")).sendKeys("Admin");
		inputvalueelement(pom.getinstanceLp().getPass(),"admin123");
		clickonelement(pom.getinstanceLp().getLogin());


	}

	


}
