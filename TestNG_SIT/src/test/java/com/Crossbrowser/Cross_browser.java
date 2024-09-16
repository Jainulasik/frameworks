package com.Crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass_pract;
import com.pageobjectmanager.Page_Object_manager_Orangehrm;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross_browser extends Baseclass_pract{

	public static WebDriver driver;

	
	
   
    @Parameters({"Browser"})
	@Test
	public void Adactin_login(String browser) {

    	Browser_launch(browser);
    	
		url_launch("https://www.whatsapp.com");

		System.out.println("whatsapp -Successfully launched");


	}










}




















