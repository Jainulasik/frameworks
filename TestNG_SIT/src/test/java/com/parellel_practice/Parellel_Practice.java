package com.parellel_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass_pract;
import com.pageobjectmanager.Page_Object_manager_Orangehrm;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parellel_Practice extends Baseclass_pract {


	WebDriver driver;

	@Test                                         
	public void OrangeHrmlogin() {

		driver = Browser_launch("chrome");
		Page_Object_manager_Orangehrm pom = new Page_Object_manager_Orangehrm(driver);

		url_launch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		implicitwait(2);

		driver.findElement(By.name("username")).sendKeys("Admin");
		inputvalueelement(pom.getinstanceLp().getPass(), "admin123");
		clickonelement(pom.getinstanceLp().getLogin());
		System.out.println("Orangehrm -Successfully launched");

	}
	
	@Test
	public void Adactin_login() {



		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("Asik");
		driver.findElement(By.id("password")).sendKeys("Asik232425");
		driver.findElement(By.id("login")).click();

		System.out.println("Adactin -Successfully launched");


	}


	@Test
	public void google () {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");



	}


















}
