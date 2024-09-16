package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Logout {
	static WebDriver driver;
	@FindBy(xpath=("//input[@name='check_all']"))
	WebElement checkall;
	@FindBy(xpath=("//input[@name='cancelall']"))
	WebElement cancelall;
    @FindBy (xpath=("//input[@name='logout']"))
	WebElement logout;
    
	public WebElement getCheckall() {
		return checkall;
	}
	public WebElement getCancelal1() {
		return cancelall;
	}
	public WebElement getLogout() {
		return logout;
	}
	public  Adactin_Logout(WebDriver abc) {
		this.driver=abc;
		PageFactory.initElements(driver, this);
	}
}
