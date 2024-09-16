package com.Orangehrm.Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Baseclass.Baseclass_pract;
import com.Orangehrm_runner.Test_Runner;
import com.Pageobjectmanager.Page_Object_manager_Orangehrm;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step_definition extends Baseclass_pract {



	static WebDriver driver = Test_Runner.driver;


	static Page_Object_manager_Orangehrm pom = new Page_Object_manager_Orangehrm(driver);


	


   @Given("^User launch the Url$")
	public void user_launch_the_Url() throws Throwable {
		url_launch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}



	@When("^User enter the Username in username section$")
	public void user_enter_the_Username_in_username_section() throws Throwable {
		implicitwait(5);
		inputvalueelement(pom.getinstanceLp().getUser(),"Admin");
	}

	@When("^User enter the password in password section$")
	public void user_enter_the_password_in_password_section() throws Throwable {
		inputvalueelement(pom.getinstanceLp().getPass(),"admin123");

	}

	@Then("^User click on login button And It navigate to the Dashboard page$")
	public void user_click_on_login_button_And_It_navigate_to_the_Dashboard_page() throws Throwable {
		clickonelement(pom.getinstanceLp().getLogin());}

//
//	   @Before
//	   private void display() {
//	    	System.out.println("  is running");}
//	    @After
//	    private void newdis() {
//			
//	System.out.println(" is completed");
//		}

	@When("^User click on Admin field And it goes to Admin page$")
	public void user_click_on_Admin_field_And_it_goes_to_Admin_page() throws Throwable {
		clickonelement(pom.getinstanceAp().getAdmin());	
	}

	@When("^User click on Configuration in configuration field$")
	public void user_click_on_Configuration_in_configuration_field() throws Throwable {
		clickonelement(pom.getinstanceAp().getConfi());
	}

	@When("^select Email configuartion in Configuration field$")
	public void select_Email_configuartion_in_Configuration_field() throws Throwable {
		clickonelement(pom.getinstanceAp().getEmailconfi());
	}

	@When("^User enter the mail id in Mail sent As field\\.$")
	public void user_enter_the_mail_id_in_Mail_sent_As_field() throws Throwable {
		inputvalueelement(pom.getinstanceAp().getMails(), "asik2324@gmail.com");
	}

	@When("^User select enable button in  Send test mail$")
	public void user_select_enable_button_in_Send_test_mail() throws Throwable {
		clickonelement(pom.getinstanceAp().getTestmail());
	}

	@When("^User enter Test mail address in Test mail address section$")
	public void user_enter_Test_mail_address_in_Test_mail_address_section() throws Throwable {
		inputvalueelement(pom.getinstanceAp().getMailadress(), "jainul12345@gmail.com");
	}
	@When("^User Saved \\.$")
	public void user_Saved() throws Throwable {
		clickonelement(pom.getinstanceAp().getSave());
	}

	@When("^User click on PIM field And it goes to PIM page$")
	public void user_click_on_PIM_field_And_it_goes_to_PIM_page() throws Throwable {
		clickonelement(pom.getinstancepp().getPIM());
	}


	@When("^User click on Add employee And It goes to Add employee page$")
	public void user_click_on_Add_employee_And_It_goes_to_Add_employee_page() throws Throwable {
		clickonelement(pom.getinstancepp().getAddemployee());
	}

	@When("^User enter the first name in first name field$")
	public void user_enter_the_first_name_in_first_name_field() throws Throwable {
		inputvalueelement(pom.getinstancepp().getAdd_employee(), "Jainul");
	}

	@When("^User enter the last name in last name field$")
	public void user_enter_the_last_name_in_last_name_field() throws Throwable {
		inputvalueelement(pom.getinstancepp().getLastname(),"Asik");

	}

	@When("^User click on create Login enable option$")
	public void user_click_on_create_Login_enable_option() throws Throwable {
		clickonelement(pom.getinstancepp().getCreatelogin());
	}

	@When("^User enter the Username in username field$")
	public void user_enter_the_Username_in_username_field() throws Throwable {
		inputvalueelement(pom.getinstancepp().getUsername(), "ashfiya");
	}

	@When("^User enter the password in password field$")
	public void user_enter_the_password_in_password_field() throws Throwable {
		inputvalueelement(pom.getinstancepp().getPassw(),"Zarin@12546");
	}

	@When("^User enter the confirm password in confirm password field$")
	public void user_enter_the_confirm_password_in_confirm_password_field() throws Throwable {
		inputvalueelement(pom.getinstancepp().getConfirmpwd(), "Zarin@12546");
	}

	@Then("^User saved$")
	public void user_saved() throws Throwable {
		clickonelement(pom.getinstancepp().getSaved());

	}

	@When("^User click on Time field and it goes to Time page$")
	public void user_click_on_Time_field_and_it_goes_to_Time_page() throws Throwable {
		clickonelement(pom.getinstanceTp().getTIME());
	}

	@When("^User click on project info in project info field$")
	public void user_click_on_project_info_in_project_info_field() throws Throwable {
		clickonelement(pom.getinstanceTp().getProject());
	}

	@When("^User Select Customers And It goes to customer page$")
	public void user_Select_Customers_And_It_goes_to_customer_page() throws Throwable {
		clickonelement(pom.getinstanceTp().getCustomers());
	}

	@When("^User click Add option in add field$")
	public void user_click_Add_option_in_add_field() throws Throwable {
		clickonelement(pom.getinstanceTp().getAdd());   
	}

	@When("^User Enter the name in name field$")
	public void user_Enter_the_name_in_name_field() throws Throwable {
		inputvalueelement(pom.getinstanceTp().getNamee(), "Ashfi");
	}

	@When("^User Enter the description in description field$")
	public void user_Enter_the_description_in_description_field() throws Throwable {
		inputvalueelement(pom.getinstanceTp().getDescription(), "Hi , Have a good day");
	}

	@When("^User Saved$")
	public void user_Saved1() throws Throwable {
		clickonelement(pom.getinstanceTp().getSave2());
	}
	@When("^User click on My info field and it goes to my info page$")
	public void user_click_on_My_info_field_and_it_goes_to_my_info_page() throws Throwable {
		clickonelement(pom.getinstanceIp().getMyinfo());
	}

	@When("^User enter first name in first name fieldd$")
	public void user_enter_first_name_in_first_name_fieldd() throws Throwable {
		inputvalueelement(pom.getinstanceIp().getEmployename(),"yasar");
	}

	@When("^User enter middle name in middle name field$")
	public void user_enter_middle_name_in_middle_name_field() throws Throwable {
		inputvalueelement(pom.getinstanceIp().getMiddlename(),"Arafath");
	}

	@When("^User enter last name in last name field$")
	public void user_enter_last_name_in_last_name_field() throws Throwable {
		inputvalueelement(pom.getinstanceIp().getLastnam(),"S");
	}

	@When("^USer enter the Nickname in nick name field$")
	public void user_enter_the_Nickname_in_nick_name_field() throws Throwable {
		inputvalueelement(pom.getinstanceIp().getNickname(),"AsikAfi");
	}

	@When("^User select license date num in license field$")
	public void user_select_license_date_num_in_license_field() throws Throwable {
		inputvalueelement(pom.getinstanceIp().getDmy(), "2023-12-31");
	}

	@When("^user select marital status in marital sattus field$")
	public void user_select_marital_status_in_marital_sattus_field() throws Throwable {
		clickonelement(pom.getinstanceIp().getMaritalstatus());
	}

	@When("^User selet gender option$")
	public void user_selet_gender_option() throws Throwable {
		clickonelement(pom.getinstanceIp().getGender2male());
	}

	@Then("^User saved(\\d+)$")
	public void user_saved(int arg1) throws Throwable {
		clickonelement(pom.getinstanceIp().getSave3());
	}

	@When("^User click on Buzz field and It goes to BUzz page$")
	public void user_click_on_Buzz_field_and_It_goes_to_BUzz_page() throws Throwable {
		clickonelement(pom.getinstanceBp().getBUZZ());
	}

	@When("^User Click on whats on your mind search option$")
	public void user_Click_on_whats_on_your_mind_search_option() throws Throwable {
		clickonelement(pom.getinstanceBp().getMinds()); 
	}

	@When("^User clicked post button$")
	public void user_clicked_post_button() throws Throwable {
		clickonelement(pom.getinstanceBp().getPost());
	}

	@When("^User click on dropdown option in top corner$")
	public void user_click_on_dropdown_option_in_top_corner() throws Throwable {
		clickonelement(pom.getinstanceOp().getLogout());
	}

	@When("^User select Logout in dropdown field$")
	public void user_select_Logout_in_dropdown_field() throws Throwable {
		clickonelement(pom.getinstanceOp().getLogutbutton());
	}


    













}
