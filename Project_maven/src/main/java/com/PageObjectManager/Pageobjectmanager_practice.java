package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.POM.Adactin_Booking;
import com.POM.Adactin_Login;
import com.POM.Adactin_Logout;
import com.POM.Adactin_MyItenary;
import com.POM.Adactin_Search_page;
import com.POM.Adactin_continuouspage;

public class Pageobjectmanager_practice {

	static	WebDriver driver;

	private Adactin_Login lp ;
	public Adactin_Login getInstanceLP() {
		if (lp==null) {
			lp=new Adactin_Login(driver);
		}
		return lp;

	}
	private Adactin_Search_page sp;
	public Adactin_Search_page getInstanceSP() {
		if (sp==null) {
			sp=new Adactin_Search_page(driver);
		}
		return sp;

	}
	private Adactin_continuouspage  cp;
	public Adactin_continuouspage  getInstanceCP() {
		if (cp==null) {
			cp=new Adactin_continuouspage(driver);
		}
		return cp;


	}
	private Adactin_Booking bp;
	public Adactin_Booking getInstanceBP() {
		if (bp==null) {
			bp=new Adactin_Booking(driver);
		}
		return bp;
	}
	
	private Adactin_MyItenary mp;
	public  Adactin_MyItenary getInstanceMP() {
		if (mp==null) {
			mp=new Adactin_MyItenary(driver);
		}
		return mp;
	}
	private Adactin_Logout lgp;
	public Adactin_Logout getInstanceLGP() {
		if (lgp==null) {
			lgp=new Adactin_Logout(driver);
		}
		return lgp;
	}

	public Pageobjectmanager_practice(WebDriver abc ) {
		this.driver=abc;
	}
}
