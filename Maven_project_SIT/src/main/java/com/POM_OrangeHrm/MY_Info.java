package com.POM_OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MY_Info {
	
	private WebDriver driver;
	
    @FindBy (xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a" )
	private WebElement myinfo;

    @FindBy (xpath = "//*[@*='firstName']" )
    private WebElement employename ;

    @FindBy (xpath = "//*[@*='middleName']" )
    private WebElement middlename ;

    @FindBy (xpath = "//*[@name='lastName']" )
    private WebElement lastnam ;

    @FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input" )
    private WebElement nickname ;

    @FindBy (xpath = "(//*[@placeholder='yyyy-mm-dd'])[1]")
    private  WebElement dmy ;

    @FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]" )
    private WebElement maritalstatus ;

    @FindBy (xpath = "//*[text()='Single']" )
    private WebElement single ;

    @FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span" )
    private WebElement gender2male ;

    @FindBy (xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button" )
    private	WebElement save3 ;

	public WebElement getMyinfo() {
		return myinfo;
	}

	public WebElement getEmployename() {
		return employename;
	}

	public WebElement getMiddlename() {
		return middlename;
	}

	public WebElement getLastnam() {
		return lastnam;
	}

	public WebElement getNickname() {
		return nickname;
	}

	public WebElement getDmy() {
		return dmy;
	}

	public WebElement getMaritalstatus() {
		return maritalstatus;
	}

	public WebElement getMarried() {
		return single;
	}

	public WebElement getGender2male() {
		return gender2male;
	}

	public WebElement getSave3() {
		return save3;
	}

    public MY_Info (WebDriver dri) {
    	driver = dri;
    	PageFactory.initElements(driver, this);
    }
	
	
	
	
}
