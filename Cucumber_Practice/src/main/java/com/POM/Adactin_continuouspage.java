package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_continuouspage {

	static WebDriver driver;
	@FindBy (xpath=("//input[@name='radiobutton_0']"))
	WebElement radio;
	@FindBy(xpath=("//input[@id='continue']"))
	WebElement cont;
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getCont() {
		return cont;
	}
	
	public Adactin_continuouspage(WebDriver abc){
		this.driver=abc;
		PageFactory.initElements(driver,this);
	}
} 
