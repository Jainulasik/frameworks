package com.Base_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass_pract {

	static WebDriver driver;

	public static WebDriver Browser_launch(String browser) {

		try {

			if (browser.equalsIgnoreCase("chrome")) {

				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();
			}

			else if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();

			return driver;
		}
		catch (RuntimeException re) {
			System.out.println(re.toString());
		}
		return driver;

	}


	public static void url_launch(String url) {

		driver.get(url);

	}

	public static void inputvalueelement(WebElement element , String value) {

		element.sendKeys(value);

	}

	public static void clickonelement(WebElement element ) {
		element.click();
	}

	public static void clearonelement(WebElement element) {
		element.clear();
	}



	public static void Robot(int value ) throws AWTException {
		Robot r = new Robot();
		r.keyPress(value);
		r.keyRelease(value);
	}

	public static void simplealert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public static void confirmationalert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	public static void promptalert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public static String selectbydropdown(WebElement element , String option , String value) {
		Select se = new Select(element);
		if (option.equalsIgnoreCase("index")) {
			int indexvalue = Integer.parseInt(value);
			se.selectByIndex(indexvalue);

		}
		else if (option.equalsIgnoreCase("value")) {
			se.selectByValue(value);
		}
		else if (option.equalsIgnoreCase("text")) {
			se.selectByVisibleText(value);
		}
		return option;

	}

	public static void Actions(WebElement element , String value) {

		Actions ac = new Actions(driver);
		if (value == "click") {
			ac.click(element).build().perform();

		}
		else if ( value == "contextclick") {
			ac.contextClick(element).build().perform();

		}
		else if (value == "doubleclick") {
			ac.doubleClick(element).build().perform();
		}
		else if (value == "movetoelement") {
			ac.moveToElement(element).build().perform();
		}
	}
	public static void windowhandles() {

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String a : windowHandles) {
			System.out.println(a);
			driver.switchTo().window(a);
			String title = driver.getTitle();
			System.out.println(title);

		}


	}

}






































