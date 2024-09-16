package com.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM_ {

	private	WebDriver driver;
	
	@FindBy (xpath = "//*[text()='PIM']")
	private WebElement PIM ;
	
	@FindBy (xpath = "//a[text()='Add Employee']" )
	private WebElement addemployee ;
	
	
	@FindBy (xpath = "//*[@*='firstName']" )
	private WebElement firstname;

	@FindBy (xpath = "//*[@*='lastName']" )
	private WebElement lastname;

	@FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div/div[2]/div[2]/div/label/span" )
	private WebElement createlogin;

	
	@FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input" )
	private WebElement username;

	
	@FindBy (xpath = "(//*[@*='password'])[1]" )
	private WebElement passw;

	
	@FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")
	private WebElement confirmpwd;

	@FindBy (xpath = "//*[@type='submit']" )
	private WebElement saved;

	public WebElement getPIM() {
		return PIM;
	}

	public WebElement getAddemployee() {
		return addemployee;
	}

	public WebElement getAdd_employee() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCreatelogin() {
		return createlogin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassw() {
		return passw;
	}

	public WebElement getConfirmpwd() {
		return confirmpwd;
	}

	public WebElement getSaved() {
		return saved;
	}

	public PIM_(WebDriver pim) {
		driver=pim;
		PageFactory.initElements(driver, this);		
	}
	
	
}
