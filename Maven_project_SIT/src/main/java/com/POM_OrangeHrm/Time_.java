package com.POM_OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Time_ {

	
	private WebDriver driver;
	
	@FindBy (xpath = "//*[text()='Time']")
	private WebElement TIME ;
	
	@FindBy (xpath = "//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")
	private WebElement project ;

	@FindBy (xpath = "(//*[text()='Customers'])[1]")
	private  WebElement customers ;

	@FindBy (xpath = "//*[text()=' Add ']")
	private WebElement add;

	@FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
	private WebElement namee;

	@FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
	private WebElement Description ;

	@FindBy (xpath = "//*[@type='submit']")
	private WebElement save2;

	public WebElement getTIME() {
		return TIME;
	}

	public WebElement getProject() {
		return project;
	}

	public WebElement getCustomers() {
		return customers;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getNamee() {
		return namee;
	}

	public WebElement getDescription() {
		return Description;
	}

	public WebElement getSave2() {
		return save2;
	}

	public Time_(WebDriver web) {
		driver = web;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
