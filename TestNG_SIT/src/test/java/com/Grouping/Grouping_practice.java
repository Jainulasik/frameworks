package com.Grouping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass_pract;
import com.pageobjectmanager.Page_Object_manager_Orangehrm;

public class Grouping_practice extends Baseclass_pract{


	WebDriver driver;

	@BeforeSuite(alwaysRun = true)                  //alwaysrun using for xml to run include method particularly                        //we can use Beforesuite,class,test,method and priority 
	public void Set_up() {                           // asci order
		driver =Browser_launch("chrome");

	}

	@Test(groups = {"Orangehrm"},enabled = false)
	public void OrangeHrmlogin() {

		url_launch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Page_Object_manager_Orangehrm pom = new Page_Object_manager_Orangehrm(driver);
		implicitwait(2);

		inputvalueelement(pom.getinstanceLp().getUser(), "Admin");
		inputvalueelement(pom.getinstanceLp().getPass(), "admin123");
		clickonelement(pom.getinstanceLp().getLogin());
		System.out.println("Orangehrm -Successfully launched");

	}

	@Test(groups = {"Adactin"})
	public void Adactin_login() {

		driver.get("https://adactinhotelapp.com/");	  
		driver.findElement(By.id("username")).sendKeys("Asik");
		driver.findElement(By.id("password")).sendKeys("Asik232425");
		driver.findElement(By.id("login")).click();

		System.out.println("Adactin -Successfully launched");


	}











}
