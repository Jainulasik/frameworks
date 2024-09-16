package com.Pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.Base_class.Base_class_Practice;
import com.PageObjectManager.Pageobjectmanager_practice;

public class Adactin_runnerpage_SDPconcept extends Base_class_Practice {

	public static WebDriver driver = browserlaunch ("chrome");

	public static Pageobjectmanager_practice pom = new Pageobjectmanager_practice (driver);


	public static void main(String[] args) {

		//login page
		Url("http://adactinhotelapp.com/");

		valuesonelement(pom.getInstanceLP().getUser(),"Asik");
		valuesonelement (pom.getInstanceLP().getPass(),"Asik232425");
		buttonclick (pom.getInstanceLP().getLogin());

		
		//Search page
		selectbydropdown (pom.getInstanceSP().getLocation(),"index","3");
		selectbydropdown (pom.getInstanceSP().getHotels(),"text","Hotel creek");
		selectbydropdown (pom.getInstanceSP().getRoom(),"index","2");
		selectbydropdown(pom.getInstanceSP().getRommtype(), "index", "2");

		valuesonelement (pom.getInstanceSP().getCheck(),"13/10/2023");
		valuesonelement (pom.getInstanceSP().getCheckout(),"14/10/2023");
		selectbydropdown (pom.getInstanceSP().getAdult(),"index","2");
		selectbydropdown(pom.getInstanceSP().getChild(),"index","1");
		buttonclick(pom.getInstanceSP().getSearch());

		//Continue page
		clickoncheckboxelement(pom.getInstanceCP().getRadio());
		buttonclick(pom.getInstanceCP().getCont());

		//Book now page

		valuesonelement (pom.getInstanceBP().getName(),("Asik"));
		valuesonelement(pom.getInstanceBP().getLastname(),"Afi");
		valuesonelement(pom.getInstanceBP().getAddress(),"Paris");
		valuesonelement(pom.getInstanceBP().getCard(),"6532345678912345");
		selectbydropdown(pom.getInstanceBP().getCc(),"index", "2");
		selectbydropdown (pom.getInstanceBP().getExp(),"index","7");
		selectbydropdown (pom.getInstanceBP().getYear(),"index","19");
		valuesonelement(pom.getInstanceBP().getCvv(),"234");
		buttonclick(pom.getInstanceBP().getBook());
		implicitywaits(10);	
         
		//Itenarry page
         
		buttonclick(pom.getInstanceMP().getNow());

		//Logout page

		clickoncheckboxelement (pom.getInstanceLGP().getCheckall());
		clickoncheckboxelement (pom.getInstanceLGP().getCancelal1());
        simplealert(pom.getInstanceLGP().getCancelal1());
	    clickoncheckboxelement (pom.getInstanceLGP().getLogout());
		
	}
}








	