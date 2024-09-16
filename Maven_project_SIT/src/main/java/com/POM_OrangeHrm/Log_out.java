package com.POM_OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_out {

	
	private WebDriver driver;
	
	@FindBy (xpath = "//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")
	private WebElement logout;

	@FindBy (xpath = "//*[text()='Logout']" )
	 private WebElement logutbutton ;

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getLogutbutton() {
		return logutbutton;
	}
	
	public Log_out (WebDriver abc) {
		driver= abc;
		PageFactory.initElements(driver, this);
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
