package com.AdactinOutline_Testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Base_class_Practice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//Adactin_Outline_Featurefile",glue="com.Stepdefinition2")

public class Adact_Outline_Testrunner extends Base_class_Practice {
	
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void Set_up() {

		driver = browserlaunch("chrome");
		
	}
	
	@AfterClass
	public static void Tear_downs() {

		quitbrowser();
	}
	
	
	

}
