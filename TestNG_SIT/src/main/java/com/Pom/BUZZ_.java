package com.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BUZZ_ {

	
	private WebDriver driver;
	
	@FindBy (xpath = "//*[text()='Buzz']")
	private WebElement BUZZ;

	
	@FindBy (xpath = "//textarea[@rows='1']")
	private WebElement minds ;

	@FindBy (xpath = "//*[@type='submit']")
	private WebElement post ;
	
	

	public WebElement getBUZZ() {
		return BUZZ;
	}

	public WebElement getMinds() {
		return minds;
	}

	public WebElement getPost() {
		return post;
	}

	public BUZZ_(WebDriver web) {
		driver = web;
		PageFactory.initElements(driver, this);
	}
	
}
