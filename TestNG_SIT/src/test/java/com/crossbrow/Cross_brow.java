package com.crossbrow;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass_pract;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross_brow extends Baseclass_pract {

	
	WebDriver driver;
	
	@Test
	public void whatsapp() {

	
    	Browser_launch("chrome");
    	
		url_launch("https://www.whatsapp.com");

	
	}
	
	@Test
	public void telegram() {

    	Browser_launch("edge");
    	
		url_launch("https://www.telegram.com");

	
	
	
	
	
	
	}
	
}
