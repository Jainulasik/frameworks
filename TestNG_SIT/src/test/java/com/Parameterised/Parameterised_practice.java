package com.Parameterised;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass_pract;
import com.pageobjectmanager.Page_Object_manager_Orangehrm;

public class Parameterised_practice extends Baseclass_pract {


	WebDriver driver;

	@Parameters("browser")
	@BeforeSuite
	public void Set_up(String brow) {
		//implicitwait(5);                              If browser run ,Dnt use implicit..
		Browser_launch(brow);

	}

	@Parameters({"url","username","password"})
	@Test
	public void orangeHrmlogin(String url,String username,String password) {

		Page_Object_manager_Orangehrm pom = new Page_Object_manager_Orangehrm(driver);
		url_launch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		implicitwait(10);

		driver.findElement(By.xpath("//*[@*='username']")).sendKeys("Admin");
		inputvalueelement(pom.getinstanceLp().getPass(),"admin123");
		clickonelement(pom.getinstanceLp().getLogin());


	}
	@Test(enabled = false)                                                             //Not working
	public void Quitbrowser() {

		quitbrowser();
	}

















}
