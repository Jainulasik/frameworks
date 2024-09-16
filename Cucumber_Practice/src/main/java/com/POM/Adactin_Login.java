package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login {

	static WebDriver driver;

	@FindBy(xpath=("//input[@name='username']"))
	private WebElement user;

	@FindBy(xpath=("//input[@name='password']"))
	private WebElement pass;

	@FindBy(xpath=("//input[@name='login']"))
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

	public Adactin_Login(WebDriver abc) {
		this.driver=abc;
		PageFactory.initElements(driver, this);
	}
	
}



