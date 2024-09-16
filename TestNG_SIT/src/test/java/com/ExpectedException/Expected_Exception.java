package com.ExpectedException;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass_pract;
import com.pageobjectmanager.Page_Object_manager_Orangehrm;

public class Expected_Exception extends Baseclass_pract {

	
WebDriver driver;
	
	@BeforeClass
	public void Set_up() {
		Browser_launch("chrome");

	}

	@Test(expectedExceptions = NoSuchElementException.class)
	public void orangeHrmlogin() {

		Page_Object_manager_Orangehrm pom = new Page_Object_manager_Orangehrm(driver);
		url_launch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		implicitwait(5);

		inputvalueelement(pom.getinstanceLp().getUser(), "admin");
		inputvalueelement(pom.getinstanceLp().getPass(), "admin123");
		clickonelement(pom.getinstanceLp().getLogin());


	}
	@AfterClass
	public void Quitbrowser() {

		quitbrowser();
	}
	
	
	
	
	
	
	
	
	
	
}
