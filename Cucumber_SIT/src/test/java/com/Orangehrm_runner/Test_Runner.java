package com.Orangehrm_runner;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Baseclass_pract;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/Orangehrm/Feature/OrangeHrm.feature",
        glue = "com.Orangehrm.Stepdefinition",
		monochrome = false)    //default value is false
//		dryRun = false,  //default value is false
//		strict = false,
//		tags = {"@Smoke"})
//		plugin = {"html:Htmlreport/OrangeHrmwesite",
//				 "pretty",
//				 "json:Jsonreport/OrangeHrmwebsite",
//				 "com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/OrangeHrm.Html"})
		
		                     



public class Test_Runner extends Baseclass_pract {

	public static WebDriver driver;
	
	@BeforeClass
	public static void browser_sentup() {

		driver = Browser_launch("chrome");
		
	}
	
//	@AfterClass
//	public static void tear_down() {
//
//		
//		quitbrowser();
	
	
	
	
	
	
	
	

	
}
	
	
	
	
	
	

