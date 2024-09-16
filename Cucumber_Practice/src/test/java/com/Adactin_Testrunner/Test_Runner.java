package com.Adactin_Testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Base_class_Practice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//Adactin//FeatureFile",glue = "com.Adactin.Stepdefinition")
//plugin = {"html:HtmlReport/Adactin_Login",
//		"pretty",
//		"json:JsonReport/Asik.json",
//		"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/Adactin_login.html"})

public class Test_Runner extends Base_class_Practice{

  public static WebDriver driver;

	@BeforeClass
	public static void Set_Up() {

		driver = browserlaunch("chrome");
	}

	@AfterClass
	public static void Tear_down() {

		quitbrowser();

	}



}
