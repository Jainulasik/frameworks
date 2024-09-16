package com.Invocationcount;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass_pract;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.pageobjectmanager.Page_Object_manager_Orangehrm;

public class Invocation_count extends Baseclass_pract {

	WebDriver driver;
	
	@Test(invocationCount = 5)
	public void Set_up() {
	driver=	Browser_launch("chrome");

	}

	@Test
	public void orangeHrmlogin() {

		Page_Object_manager_Orangehrm pom = new Page_Object_manager_Orangehrm(driver);
		implicitwait(10);
		url_launch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		inputvalueelement(pom.getinstanceLp().getUser(), "Admin");
		inputvalueelement(pom.getinstanceLp().getPass(), "admin123");
		clickonelement(pom.getinstanceLp().getLogin());


	}
	@Test                                  //Not working
	public void Quitbrowser() {

		quitbrowser();
	}
	
}
