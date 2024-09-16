package com.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {


	private WebDriver driver;

	@FindBy(name = "username")
	private WebElement user;


	@FindBy (name = "password")
	private WebElement pass;

	@FindBy (xpath = "//button[@type='submit']")
	private WebElement login;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public Login(WebDriver web) {
		
		driver = web;
		
		PageFactory.initElements(driver, this);
	}
	
	

	
	




}
