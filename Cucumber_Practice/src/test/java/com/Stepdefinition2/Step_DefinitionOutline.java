package com.Stepdefinition2;

import org.openqa.selenium.WebDriver;

import com.AdactinOutline_Testrunner.Adact_Outline_Testrunner;
import com.Baseclass.Base_class_Practice;
import com.PageobjectManager.Pageobjectmanager_practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_DefinitionOutline extends Base_class_Practice{
	
	public static WebDriver driver = Adact_Outline_Testrunner.driver;
	
	Pageobjectmanager_practice pom = new Pageobjectmanager_practice(driver);
	
	@Given("^User launch the Url$")
	public void user_launch_the_Url() throws Throwable {
	    Url("https://www.adactinhotelapp.com/");
	}

	@When("^User Enter the \"([^\"]*)\" in name section$")
	public void user_Enter_the_in_name_section(String arg1) throws Throwable {
	  valuesonelement(pom.getInstanceLP().getUser(), "Asik@232425" );
	}

	@When("^User Enter the \"([^\"]*)\" in password section$")
	public void user_Enter_the_in_password_section(String arg1) throws Throwable {
	    valuesonelement(pom.getInstanceLP().getPass(), "1234567");
	}

	@Then("^User click the Login button and It goes to \\[Search hotel\\] page$")
	public void user_click_the_Login_button_and_It_goes_to_Search_hotel_page() throws Throwable {
	   buttonclick(pom.getInstanceLP().getLogin());
	}

	

	}
	
	


