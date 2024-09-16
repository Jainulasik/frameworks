package com.Dependsongroup;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass_pract;
import com.pageobjectmanager.Page_Object_manager_Orangehrm;

public class Depends_on_group extends Baseclass_pract {
	WebDriver driver;

	@BeforeSuite
	public void Set_up() {                                                     // asci order
		driver =Browser_launch("chrome");

	}

	@Test                                   //    Used groups name for access xml and use depends on grup method
	public void OrangeHrmlogin() {

		url_launch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Page_Object_manager_Orangehrm pom = new Page_Object_manager_Orangehrm(driver);
		implicitwait(2);

		inputvalueelement(pom.getinstanceLp().getUser(), "Admin");
		inputvalueelement(pom.getinstanceLp().getPass(), "admin123");
		clickonelement(pom.getinstanceLp().getLogin());
		System.out.println("Orangehrm -Successfully launched");

	}

	@Test(dependsOnGroups = "Set_up") 
	public void ZAdactin_login() {

		driver.get("https://adactinhotelapp.com/");	  
		driver.findElement(By.id("username")).sendKeys("Asik");
		driver.findElement(By.id("password")).sendKeys("Asik232425");
		driver.findElement(By.id("login")).click();

		System.out.println("Adactin -Successfully launched");


	}
	
	@Test
	public void Quitbrowser() {

		quitbrowser();
	}
	
}
