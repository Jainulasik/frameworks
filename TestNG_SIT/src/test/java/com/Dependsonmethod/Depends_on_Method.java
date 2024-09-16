package com.Dependsonmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass_pract;
import com.pageobjectmanager.Page_Object_manager_Orangehrm;

public class Depends_on_Method extends Baseclass_pract {

	WebDriver driver;
	
	@BeforeSuite
	public void Set_up() {
		//implicitwait(5);
		Browser_launch("chrome");

	}
	
	@Test
	public  void Google() {
		url_launch("https://www.google.com");		
	}
	
	

	@Test(dependsOnMethods = "Set_up")
	public void OrangeHrmlogin() {

		url_launch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Page_Object_manager_Orangehrm pom = new Page_Object_manager_Orangehrm(driver);
		implicitwait(2);

		inputvalueelement(pom.getinstanceLp().getUser(), "Admin");
		inputvalueelement(pom.getinstanceLp().getPass(), "admin123");
		clickonelement(pom.getinstanceLp().getLogin());


	}
	@Test
	public void Quitbrowser() {

		quitbrowser();
	}
	
	
	
	
}
