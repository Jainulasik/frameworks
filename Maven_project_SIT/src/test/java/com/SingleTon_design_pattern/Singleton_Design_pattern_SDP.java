package com.SingleTon_design_pattern;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Base_class.Baseclass_pract;
import com.POM_OrangeHrm.Admin_;
import com.POM_OrangeHrm.BUZZ_;
import com.POM_OrangeHrm.Leave_;
import com.POM_OrangeHrm.Log_out;
import com.POM_OrangeHrm.MY_Info;
import com.POM_OrangeHrm.PIM_;
import com.PageobjectManger.Page_Object_manager_Orangehrm;

public class Singleton_Design_pattern_SDP extends Baseclass_pract{

	
	public static WebDriver driver = Browser_launch("chrome");
	
	public static Page_Object_manager_Orangehrm pom = new Page_Object_manager_Orangehrm(driver);
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
   //LOGIN
		
		    url_launch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   
	        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

			inputvalueelement(pom.getinstanceLp().getUser(), "Admin");

			inputvalueelement(pom.getinstanceLp().getPass(), "admin123");

	        clickonelement(pom.getinstanceLp().getLogin());
		
//	//ADMIN
//	        
//			
//			clickonelement(pom.getinstanceAp().getAdmin());
//			Thread.sleep(3000);
//			clickonelement(pom.getinstanceAp().getConfi());
//
//			Thread.sleep(3000);
//			clickonelement(pom.getinstanceAp().getEmailconfi());
//
//			Thread.sleep(3000);
//			clickonelement(pom.getinstanceAp().getMails());
//
//
//			Robot r = new Robot();
//			r.keyPress(KeyEvent.VK_CONTROL);
//			r.keyPress(KeyEvent.VK_A);
//
//	    	inputvalueelement(pom.getinstanceAp().getMails(), "asik@gmail.com");
//
//			Thread.sleep(2000);
//			clickonelement(pom.getinstanceAp().getTestmail());
//
//			Thread.sleep(2000);
//			inputvalueelement(pom.getinstanceAp().getMailadress(), "asik2324@gmail.com");
//
//			Thread.sleep(2000);
//			clickonelement(pom.getinstanceAp().getSave());
//			
//		
//	
//	
//	//pim
//	
////	Thread.sleep(2000);
////	clickonelement(pom.getinstancepp().getPIM());
////
////	Thread.sleep(2000);
////	clickonelement(pom.getinstancepp().getAddemployee());
////
////	Thread.sleep(2000);
////	inputvalueelement(pom.getinstancepp(), "Asik");
////
////	Thread.sleep(2000);
////	inputvalueelement(pom.getinstancepp().getLastname(), "jainul");
////
////
////	Thread.sleep(2000);
////	clickonelement(pom.getinstancepp().getCreatelogin());
////
////	Thread.sleep(2000);
////	inputvalueelement(pom.getinstancepp().getUsername(), "Asikjainul7");
////
////	Thread.sleep(2000);
////	inputvalueelement(pom.getinstancepp().getPassw(), "Asik@232425");
////
////	Thread.sleep(2000);
////
////	inputvalueelement(pom.getinstancepp().getConfirmpwd(), "Asik@232425");
////
////	Thread.sleep(2000);
////	clickonelement(pom.getinstancepp().getSaved());
////	
//
//	//time
//	
//	clickonelement(pom.getinstanceTp().getTIME());
//
//	Thread.sleep(2000);
//	clickonelement(pom.getinstanceTp().getProject());
//
//	Thread.sleep(2000);
//	clickonelement(pom.getinstanceTp().getCustomers());
//
//	Thread.sleep(2000);
//	clickonelement(pom.getinstanceTp().getAdd());
//
//	Thread.sleep(2000);
//	inputvalueelement(pom.getinstanceTp().getNamee(), "yasar");
//
//	Thread.sleep(2000);
//
//	inputvalueelement(pom.getinstanceTp().getDescription(), "Hi there , Have a good day");
//
//    clickonelement(pom.getinstanceTp().getSave2());
//
//	
	//my info 
    
	clickonelement(pom.getinstanceIp().getMyinfo());

	Thread.sleep(2000);
	clickonelement(pom.getinstanceIp().getEmployename());

	Robot rrr = new Robot();
	rrr.keyPress(KeyEvent.VK_CONTROL);
	rrr.keyPress(KeyEvent.VK_A);

	inputvalueelement(pom.getinstanceIp().getEmployename(), "Jainul");

	clickonelement(pom.getinstanceIp().getMiddlename());
	Robot rr = new Robot();
	rr.keyPress(KeyEvent.VK_CONTROL);
	rr.keyPress(KeyEvent.VK_A);

 inputvalueelement(pom.getinstanceIp().getMiddlename(), "asik");


	Thread.sleep(2000);
	clickonelement(pom.getinstanceIp().getLastnam());

	Robot res = new Robot();
	res.keyPress(KeyEvent.VK_CONTROL);
	res.keyPress(KeyEvent.VK_A);

	inputvalueelement(pom.getinstanceIp().getLastnam(), "S");

	Thread.sleep(2000);
	clickonelement(pom.getinstanceIp().getNickname());

	Robot re = new Robot();
	re.keyPress(KeyEvent.VK_CONTROL);
	re.keyPress(KeyEvent.VK_A);


	inputvalueelement(pom.getinstanceIp().getNickname(), "Asi");


		    
//    clickonelement(pom.getinstanceIp().getDmy());
//				    
//	Robot rob = new Robot();
//	rob.keyPress(KeyEvent.VK_CONTROL);
//	rob.keyPress(KeyEvent.VK_A);
//				    
//    inputvalueelement(pom.getinstanceIp().getDmy(),"2023-12-25");

	Thread.sleep(2000);
	clickonelement(pom.getinstanceIp().getMaritalstatus());

	Thread.sleep(2000);
	clickonelement(pom.getinstanceIp().getMarried());

	Thread.sleep(2000);
	clickonelement(pom.getinstanceIp().getGender2male());

	Thread.sleep(2000);
	clickonelement(pom.getinstanceIp().getSave3());

//LEAVE    

	
	Thread.sleep(2000);
	clickonelement(pom.getinstanceLLP().getLEAVE());

	Thread.sleep(2000);
	clickonelement(pom.getinstanceLLP().getLeavelist());

	Thread.sleep(2000);
   clickonelement(pom.getinstanceLLP().getApprove());
   
//BUZZ  

   
   
    Thread.sleep(2000);
	clickonelement(pom.getinstanceBp().getBUZZ());
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


	Thread.sleep(2000);
	clickonelement(pom.getinstanceBp().getMinds());

	inputvalueelement(pom.getinstanceBp().getMinds(), "Hi");

   clickonelement(pom.getinstanceBp().getPost());
	
//LOG OUT

   
	Thread.sleep(2000);
	clickonelement(pom.getinstanceOp().getLogout());

	Thread.sleep(2000);
	pom.getinstanceOp().getLogutbutton().click();
	
	

	      











	
	}

}
	


