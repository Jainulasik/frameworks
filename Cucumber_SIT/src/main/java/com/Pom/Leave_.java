package com.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leave_ {



	private WebDriver driver ;

	@FindBy (xpath = "//*[@*='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")
	private WebElement LEAVE;

	@FindBy (xpath = "(//*[text()='Leave List'])[1]")
	private WebElement leavelist ;


	@FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[9]/div/button[1]")
	private WebElement approve ;
	
	
	public WebElement getLEAVE() {
		return LEAVE;
	}

	public WebElement getLeavelist() {
		return leavelist;
	}

	public WebElement getApprove() {
		return approve;
	}

	public Leave_ (WebDriver web) {
		driver = web;
		PageFactory.initElements(driver, this);
	}







}
