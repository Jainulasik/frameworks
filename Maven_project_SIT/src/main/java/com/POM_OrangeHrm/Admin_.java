package com.POM_OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_ {


	private WebDriver driver;

	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement admin;

	@FindBy (xpath = "//*[text()='Configuration ']")
	private WebElement confi;

	@FindBy (xpath = "//a[text()='Email Configuration']")
	private WebElement emailconfi;

	@FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/input")
	private WebElement mails;
	
	
	@FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div/label/span")
	private WebElement testmail;
	
	@FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div[2]/input")
	private WebElement mailadress;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement save;


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getAdmin() {
		return admin;
	}


	public WebElement getConfi() {
		return confi;
	}


	public WebElement getEmailconfi() {
		return emailconfi;
	}


	public WebElement getMails() {
		return mails;
	}

	public WebElement getTestmail() {
		return testmail;
	}

	public WebElement getMailadress() {
		return mailadress;
	}


	public WebElement getSave() {
		return save;
	}


	public Admin_(WebDriver web) {
		driver = web;
		PageFactory.initElements(driver, this);














	}
}