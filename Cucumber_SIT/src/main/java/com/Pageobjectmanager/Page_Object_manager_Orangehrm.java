package com.Pageobjectmanager;
import com.Pom.Admin_;
import com.Pom.BUZZ_;
import com.Pom.Leave_;
import com.Pom.Log_out;
import com.Pom.Login;
import com.Pom.MY_Info;
import com.Pom.PIM_;
import com.Pom.Time_;

import java.sql.Time;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;


import com.github.dockerjava.api.model.Driver;

public class Page_Object_manager_Orangehrm {

	WebDriver driver;

	public Login lp;

	public Page_Object_manager_Orangehrm (WebDriver driver2){
		driver=driver2;
	}

	public Login getinstanceLp() {
		if (lp == null) {
			lp=new Login(driver);
		}
		return lp;

	}


	private Admin_ Ap;

	public Admin_ getinstanceAp() {
		if (Ap == null) {
			Ap=new Admin_(driver);
		}
		return Ap;
	}


	private PIM_ pp ;

	public PIM_ getinstancepp() {	
		if (pp == null) {
			pp= new PIM_(driver);
		}
		return pp;


	}

	private Time_ tp ;

	public Time_ getinstanceTp() {
		if (tp == null) {
			tp = new Time_(driver);
		}
		return tp;
	}

	

	private MY_Info ip;
	
     public MY_Info getinstanceIp() {
    	 if (ip ==null) {
    		 ip=new MY_Info(driver);

	}	
    	 return ip;
     }
     
     
   private  Leave_ llp ;
     
     public Leave_ getinstanceLLP() {

    	 if (llp == null) {
    		 llp = new Leave_(driver);
    	 }
    	 return llp;
    	 
    	 
	}

    	private BUZZ_ bp ;
    	
    	public BUZZ_ getinstanceBp() {
    		
    		if (bp == null) {
    			bp= new BUZZ_(driver);
    		}
    		return bp;	

		}
    	 
	private Log_out op ;
	public Log_out getinstanceOp() {
		
		if (op == null) {
			op=new Log_out(driver);
		}
		return op;
	
}








}









