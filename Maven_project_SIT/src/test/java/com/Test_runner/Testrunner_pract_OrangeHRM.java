package com.Test_runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base_class.Baseclass_pract;
import com.POM_OrangeHrm.Admin_;
import com.POM_OrangeHrm.BUZZ_;
import com.POM_OrangeHrm.Leave_;
import com.POM_OrangeHrm.Log_out;
import com.POM_OrangeHrm.Login;
import com.POM_OrangeHrm.MY_Info;
import com.POM_OrangeHrm.PIM_;
import com.POM_OrangeHrm.Time_;


public class Testrunner_pract_OrangeHRM extends Baseclass_pract {

	
	public static WebDriver driver = Browser_launch("chrome");

	public static void main (String []args) throws AWTException, InterruptedException {
		
   Login lp = new Login(driver);

	    url_launch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		inputvalueelement(lp.getUser(), "Admin");

		inputvalueelement(lp.getPass(), "admin123");

        clickonelement(lp.getLogin());
     
        
    Admin_ ad = new Admin_(driver);

		clickonelement(ad.getAdmin());

		Thread.sleep(3000);
		clickonelement(ad.getConfi());

		Thread.sleep(3000);
		clickonelement(ad.getEmailconfi());

		Thread.sleep(3000);
		clickonelement(ad.getMails());


		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);

    	inputvalueelement(ad.getMails(), "asik@gmail.com");

		Thread.sleep(2000);
		clickonelement(ad.getTestmail());

		Thread.sleep(2000);
		inputvalueelement(ad.getMailadress(), "asik@gmail.com");

		Thread.sleep(2000);
		clickonelement(ad.getSave());

 //PIM

		PIM_ pi = new PIM_(driver);
		Thread.sleep(2000);
		clickonelement(pi.getPIM());

		Thread.sleep(2000);
		clickonelement(pi.getAddemployee());

		Thread.sleep(2000);
		inputvalueelement(pi.getAdd_employee(), "Asik");

		Thread.sleep(2000);
		inputvalueelement(pi.getLastname(), "jainul");


		Thread.sleep(2000);
		clickonelement(pi.getCreatelogin());

		Thread.sleep(2000);
		inputvalueelement(pi.getUsername(), "Asikjainul7");

		Thread.sleep(2000);
		inputvalueelement(pi.getPassw(), "Asik@232425");

		Thread.sleep(2000);

		inputvalueelement(pi.getConfirmpwd(), "Asik@232425");

		Thread.sleep(2000);
		clickonelement(pi.getSaved());

	//TIME

		Time_ ti = new Time_(driver);
		
		Thread.sleep(2000);
		clickonelement(ti.getTIME());

		Thread.sleep(2000);
		clickonelement(ti.getProject());

		Thread.sleep(2000);
		clickonelement(ti.getCustomers());

		Thread.sleep(2000);
		clickonelement(ti.getAdd());

		Thread.sleep(2000);
		inputvalueelement(ti.getNamee(), "yasar");

		Thread.sleep(2000);

		inputvalueelement(ti.getDescription(), "Hi there , Have a good day");

        clickonelement(ti.getSave2());

  //MY INFO    

        MY_Info in = new MY_Info(driver);
		clickonelement(in.getMyinfo());

		Thread.sleep(2000);
		clickonelement(in.getEmployename());

		Robot rrr = new Robot();
		rrr.keyPress(KeyEvent.VK_CONTROL);
		rrr.keyPress(KeyEvent.VK_A);

		inputvalueelement(in.getEmployename(), "Jainul");

		clickonelement(in.getMiddlename());
		Robot rr = new Robot();
		rr.keyPress(KeyEvent.VK_CONTROL);
		rr.keyPress(KeyEvent.VK_A);

     inputvalueelement(in.getMiddlename(), "asik");


		Thread.sleep(2000);
		clickonelement(in.getLastnam());

		Robot res = new Robot();
		res.keyPress(KeyEvent.VK_CONTROL);
		res.keyPress(KeyEvent.VK_A);

		inputvalueelement(in.getLastnam(), "S");

		Thread.sleep(2000);
		clickonelement(in.getNickname());

		Robot re = new Robot();
		re.keyPress(KeyEvent.VK_CONTROL);
		re.keyPress(KeyEvent.VK_A);


		inputvalueelement(in.getNickname(), "Asi");


			    
	    clickonelement(in.getDmy());
					    
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
					    
        inputvalueelement(in.getDmy(),"2023-12-25");

		Thread.sleep(2000);
		clickonelement(in.getMaritalstatus());

		Thread.sleep(2000);
		clickonelement(in.getMarried());

		Thread.sleep(2000);
		clickonelement(in.getGender2male());

		Thread.sleep(2000);
		clickonelement(in.getSave3());

	//LEAVE    

		Leave_ le = new Leave_(driver);
		
		Thread.sleep(2000);
		clickonelement(le.getLEAVE());

		Thread.sleep(2000);
		clickonelement(le.getLeavelist());

		Thread.sleep(2000);
	   clickonelement(le.getApprove());
	   
	//BUZZ  

	   
	 BUZZ_ buz = new BUZZ_(driver);
	   
	   
	    Thread.sleep(2000);
		clickonelement(buz.getBUZZ());
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


		Thread.sleep(2000);
		clickonelement(buz.getMinds());

		inputvalueelement(buz.getMinds(), "Hi");
	
       clickonelement(buz.getPost());
		
	//LOG OUT

       
       Log_out lo = new Log_out(driver);
		Thread.sleep(2000);
		clickonelement(lo.getLogout());

		Thread.sleep(2000);
		lo.getLogutbutton().click();
		
		

		      














	}



}
