package com.Adactin.Stepdefinition;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.Adactin_Testrunner.Test_Runner;
import com.Baseclass.Base_class_Practice;
import com.PageobjectManager.Pageobjectmanager_practice;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_class_Practice {

	public static WebDriver driver = Test_Runner.driver;

	Pageobjectmanager_practice pom = new Pageobjectmanager_practice(driver);


	@Given("^User launch the Url$")
	public void user_launch_the_Url() throws Throwable {

		Url("https://adactinhotelapp.com/");

	}

	@When("^User Enter the Username in name section$")
	public void user_Enter_the_Username_in_name_section() throws Throwable {
		valuesonelement(pom.getInstanceLP().getUser(),"Asik232425");

	}

	@When("^User Enter the password in password section$")
	public void user_Enter_the_password_in_password_section() throws Throwable {
		valuesonelement(pom.getInstanceLP().getPass(), "1234567");
	}

	@Then("^User click the Login button and It goes to \\[Search hotel\\] page$")
	public void user_click_the_Login_button_and_It_goes_to_Search_hotel_page() throws Throwable {
		buttonclick(pom.getInstanceLP().getLogin());
	}
//
//	   @Before
//	   private void display(Scenario s) {
//	    	System.out.println(s.toString()+"  is running");}
//	    @After
//	    private void newdis(Scenario s) {
//			
//	System.out.println(s.toString()+" is completed");
//		}

	@When("^User Select the location in location field$")
	public void user_Select_the_location_in_location_field() throws Throwable {
		selectbydropdown(pom.getInstanceSP().getLocation(),"index", "3");
	}


	@When("^User Select the Hotels in Hotel field$")
	public void user_Select_the_Hotels_in_Hotel_field() throws Throwable {
		selectbydropdown(pom.getInstanceSP().getHotels(), "index", "2");
	}

	@When("^User Select the Roomtype in Room field$")
	public void user_Select_the_Roomtype_in_Room_field() throws Throwable {
		selectbydropdown(pom.getInstanceSP().getRommtype(),"index","2");
	}

	@When("^User Select the Number of rooms in Number of Rooms field$")
	public void user_Select_the_Number_of_rooms_in_Number_of_Rooms_field() throws Throwable {
		selectbydropdown(pom.getInstanceSP().getRoom(),"index","2");

	}

	@When("^User Select In date in Check In date field$")
	public void user_Select_In_date_in_Check_In_date_field() throws Throwable {
		clearonelement(pom.getInstanceSP().getCheck());
		valuesonelement(pom.getInstanceSP().getCheck(), "30/11/2023");

	}


	@When("^User Select out date in check In date field$")
	public void user_Select_out_date_in_check_In_date_field() throws Throwable {
		clearonelement(pom.getInstanceSP().getCheckout());
		valuesonelement(pom.getInstanceSP().getCheckout(), "31/11/2023");
	}

	@When("^User Select the Adults per room in Adults Room field$")
	public void user_Select_the_Adults_per_room_in_Adults_Room_field() throws Throwable {
		selectbydropdown(pom.getInstanceSP().getAdult(),"index","1");
	}

	@When("^User Select the Children per room in Child room field$")
	public void user_Select_the_Children_per_room_in_Child_room_field() throws Throwable {
		selectbydropdown(pom.getInstanceSP().getChild(),"index","2");
	}

	@Then("^User Click the Search button and It goes to \\[Select hotel\\] page$")
	public void user_Click_the_Search_button_and_It_goes_to_Select_hotel_page() throws Throwable {
		buttonclick(pom.getInstanceSP().getSearch());   
	}

	@When("^User click the selected hotel name \\.$")
	public void user_click_the_selected_hotel_name() throws Throwable {
		buttonclick(pom.getInstanceCP().getRadio());
	}

	@Then("^User click the Continue button and It goes to \\[Book a Hotel\\] page$")
	public void user_click_the_Continue_button_and_It_goes_to_Book_a_Hotel_page() throws Throwable {
		buttonclick(pom.getInstanceCP().getCont());
	}

	@When("^User Enter the First name in First name section$")
	public void user_Enter_the_First_name_in_First_name_section() throws Throwable {
		valuesonelement(pom.getInstanceBP().getName(),"Jainul");	
	}

	@When("^User Enter the Last name in Last name Section$")
	public void user_Enter_the_Last_name_in_Last_name_Section() throws Throwable {
		valuesonelement(pom.getInstanceBP().getLastname(),"Asik");

	}

	@When("^User Enter the Billing Address in Address section$")
	public void user_Enter_the_Billing_Address_in_Address_section() throws Throwable {
		valuesonelement(pom.getInstanceBP().getAddress(),"2/10,North street paris");	

	}

	@When("^User Enter the Credit Card number on Credit card number section$")
	public void user_Enter_the_Credit_Card_number_on_Credit_card_number_section() throws Throwable {
		valuesonelement(pom.getInstanceBP().getCard(),"1234567891011258");	

	}

	@When("^User Select the Credit card type in Credit card section$")
	public void user_Select_the_Credit_card_type_in_Credit_card_section() throws Throwable {
		selectbydropdown(pom.getInstanceBP().getCc(),"index","1");
	}

	@When("^User Select the expiry date and year of credit card in Expiry date section$")
	public void user_Select_the_expiry_date_and_year_of_credit_card_in_Expiry_date_section() throws Throwable {
		selectbydropdown(pom.getInstanceBP().getExp(),"index","1");
		selectbydropdown(pom.getInstanceBP().getYear(),"index","12");

	}

	@When("^User Enter the Cvv num in Cvv section$")
	public void user_Enter_the_Cvv_num_in_Cvv_section() throws Throwable {
		valuesonelement(pom.getInstanceBP().getCvv(), "256");

	}


	@Then("^User click the Book now button and It goes to Booking Confirmation page$")
	public void user_click_the_Book_now_button_and_It_goes_to_Booking_Confirmation_page() throws Throwable {
		buttonclick(pom.getInstanceBP().getBook());
	}

	@Then("^User click  My Itinerary button  and   It goes to Booked Itinerary	page$")
	public void user_click_My_Itinerary_button_and_It_goes_to_Booked_Itinerary_page() throws Throwable {
		implicitywaits(10);
		buttonclick(pom.getInstanceMP().getNow());
	}


	@When("^User click select  all options\\.$")
	public void user_click_select_all_options() throws Throwable {
		buttonclick(pom.getInstanceLGP().getCheckall());
	}

	@When("^User click Cancel selected button\\.$")
	public void user_click_Cancel_selected_button() throws Throwable {
		buttonclick(pom.getInstanceLGP().getCancelal1());

	}
	@When("^User click the ok button to cancel and it goes to Logout page$")
	public void user_click_the_ok_button_to_cancel_and_it_goes_to_Logout_page() throws Throwable {
		simplealertss();
	}

	@Then("^User click the Logout button$")
	public void user_click_the_Logout_button() throws Throwable {
		Clickonlogout(pom.getInstanceLGP().getLogout());
	}


}



