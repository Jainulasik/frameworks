package om.Dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Baseclass.Baseclass_pract;
import com.pageobjectmanager.Page_Object_manager_Orangehrm;

public class Data_provider extends Baseclass_pract {


	WebDriver driver;

	@DataProvider(name="user")
	public void Mydata() {
		String data [][] = new String[3][2];

		data [0][0] = "Asi";
		data [0][1] = "Asik@23";
		
		data [1][0] = "Admin";
		data [1][1] = "Admin@1";
		
		data[2][0] = "Admin";
		data[2][1] = "admin123";
		
	}


	@BeforeSuite
	public void Set_up() {
		driver = Browser_launch("chrome");

	}


	@Test(dataProvider = "user")
	public void OrangeHrmlogin(String un,String pw) {

		Page_Object_manager_Orangehrm pom = new Page_Object_manager_Orangehrm(driver);
		url_launch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		implicitwait(10);

		driver.findElement(By.xpath("//*[@*='username']")).sendKeys("Admin");
		inputvalueelement(pom.getinstanceLp().getPass(),"admin123");
		clickonelement(pom.getinstanceLp().getLogin());


	}


	@Test(dependsOnMethods ="OrangeHrmlogin" )
	public  void google() {
		url_launch("https://www.google.com");		
	}











}
