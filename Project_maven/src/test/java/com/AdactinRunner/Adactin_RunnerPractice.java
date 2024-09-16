package com.AdactinRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import com.Base_class.Base_class_Practice;
import com.POM.Adactin_Booking;
import com.POM.Adactin_Login;
import com.POM.Adactin_Logout;
import com.POM.Adactin_MyItenary;
import com.POM.Adactin_Search_page;
import com.POM.Adactin_continuouspage;

public class Adactin_RunnerPractice extends Base_class_Practice{

	public static WebDriver driver = browserlaunch("chrome");

	public static void main(String[] args) {
		Adactin_Login lp = new Adactin_Login(driver);
		Url("https://adactinhotelapp.com/");
		valuesonelement(lp.getUser(),"Asik232425");
		valuesonelement(lp.getPass(),"1234567");
		buttonclick(lp.getLogin());

		Adactin_Search_page sp = new Adactin_Search_page(driver);

		selectbydropdown(sp.getLocation(), "index","3");
		selectbydropdown(sp.getHotels(),"text","Hotel Creek");	
		selectbydropdown(sp.getRoom(),"index", "2");
		selectbydropdown(sp.getRommtype(), "index", "2");
		valuesonelement(sp.getCheck(),"22/10/2023");
		valuesonelement(sp.getCheckout(),"25/10/2023");
		selectbydropdown(sp.getAdult(),"index","2");
		selectbydropdown(sp.getChild(),"index","1");
		buttonclick(sp.getSearch());

		Adactin_continuouspage cp = new Adactin_continuouspage(driver);	
		clickoncheckboxelement(cp.getRadio());
		buttonclick(cp.getCont());

		Adactin_Booking ab = new Adactin_Booking(driver);
		valuesonelement(ab.getName(),"Asik");
		valuesonelement(ab.getLastname(),"Afi");
		valuesonelement(ab.getAddress(),"Paris");
		valuesonelement(ab.getCard(), "95666444645121314");
		selectbydropdown(ab.getCc(),"index","1");
		selectbydropdown(ab.getExp(),"index","7");
		selectbydropdown(ab.getYear(),"index","19");
		valuesonelement(ab.getCvv(),"123");
		buttonclick(ab.getBook());

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		Adactin_MyItenary mi = new Adactin_MyItenary(driver);
		buttonclick(mi.getNow());

		Adactin_Logout aa = new Adactin_Logout(driver);
		clickoncheckboxelement(aa.getCheckall());
		clickoncheckboxelement(aa.getCancelal1());
		clickonalerts(aa.getCancelal1(), "accept");
           Clickonlogout(aa.getLogout());
		
		
	}


}















