package com.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class_Practice {


	static  WebDriver driver ;

	public static  WebDriver browserlaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}


		else if (browser.equalsIgnoreCase("FireFOX")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}

		else if (browser.equalsIgnoreCase("EDGe")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();

		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void Url(String url) {
		driver.get(url);

	}
	public static void valuesonelement(WebElement element,String value ) {
		element.sendKeys(value);
	}

	public static void buttonclick(WebElement element) {
		element.click();
	}

	public static String selectbydropdown(WebElement element ,String Option ,String Value)  {

		Select s = new Select(element);
		if (Option.equalsIgnoreCase("index")) {
			int indexvalue = Integer.parseInt(Value);
			s.selectByIndex(indexvalue);
		}
		else if (Option.equalsIgnoreCase("Value")) {
			s.selectByValue(Value);
		}
		else if ( Option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(Value);
		}
		return Option;

	}

	public static void clearonelement(WebElement element) {
		element.clear();
	}

	public static void clickoncheckboxelement(WebElement element ) {
		element.click();
	}

	public static void simplealert(WebElement element) {
		element.click();
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public static void Confirmationalert(WebElement element) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static void clickonalerts(WebElement element ,String value) {
		Alert alert = driver.switchTo().alert();
		if (value == "accept") {
			alert.accept();
		}
		else if (value == "dismiss");{
			alert.dismiss();
		}
	}


	public static void Promptalert(WebElement element) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public static void Clickonlogout(WebElement element) {
		element.click();

	}

	public static void elementisenabled(WebElement element) {
		element.isEnabled();

	}
	public static void elementisDisplayed(WebElement element ) {
		element.isDisplayed();
	}
	public static void selected(WebElement element) {
		element.isSelected();

	}
	public static void Navigaterefresh() {
		driver.navigate().refresh();
	}

	public static void quitbrowser() {
		driver.quit();
	}

	public static void NavigatetoUrl(String Url) {
		driver.navigate().to(Url);
	}

	public static void NavigatebacktoUrl() {
		driver.navigate().back();
	}
	public static void NavigateforwardtoUrl () {
		driver.navigate().forward();
	}

	public static void closethetab() {
		driver.close();
	}

	public static String gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;


	}

	public static void getcurrentUrl() {
		driver.getCurrentUrl();
	}
	public static void gettext(WebElement element) {
		element.getText();

	}

	public static void getAttribute(WebElement element ,String value ,String name) {
		element.getAttribute(value);
		element.getAttribute(name);
	}



	public static void getoptions(WebElement element ) {
		Select sc = new Select(element);
		List<WebElement> options = sc.getOptions();
		System.out.println("OptionsAre:");
		for (int i=0;i<options.size();i++) {
			WebElement element2 = options.get(i);
			String text =element2.getText();	
			System.out.println(text);
		}
	}

	public static  void getallselectedoptions(WebElement element) {
		Select sc = new Select(element);
		List<WebElement> allSelectedOptions = sc.getAllSelectedOptions();
		System.out.println("Alloptionsare:");
		for (int i=0; i<allSelectedOptions.size();i++) {
			WebElement element3 = allSelectedOptions.get(i);
			String text = element3.getText();
			System.out.println(text);


		}
	}

	public static String getfirstselectedoptions(WebElement element) {
		Select sc = new Select(element);
		WebElement firstSelectedOption = sc.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
		return text;
	}
	public static void ismultiple(WebElement element) {
		Select sc = new Select(element);
		boolean multiple = sc.isMultiple();
		System.out.println(multiple);
	}

	public static void implicitywaits(int Duration) {
		driver.manage().timeouts().implicitlyWait(Duration, TimeUnit.SECONDS);
	}

	public static void explicitwaits (int duration) {
		WebDriverWait ew = new WebDriverWait(driver, duration);
		ew.until(null);
	}

	public static  String Windowshandle() {
		String windowshandle = driver.getWindowHandle();
		System.out.println(windowshandle);
		return windowshandle;
	}


	public static void windowhandles() {

		Set<String> windowlandles = driver.getWindowHandles();
		System.out.println (windowlandles);
		for (String ab : windowlandles) {
			System.out. println(ab);
			driver. switchTo() .window(ab);
			String title = driver.getTitle();
			System.out.println(title);
		}
	}

	public static void Actions(WebElement element ,String value) {
		Actions a = new Actions(driver);
		if (value == "click") {
			a.click(element).build().perform();

		}
		else if (value == "doubleclick") {
			a.click(element).build().perform();

		}
		else if (value == "contextclick") {
			a.click(element).build().perform();
		}
		else if (value == "movetoelement") {
			a.click(element).build().perform();
		}
	}

	public static void Draganddrop(WebElement element1,WebElement element2,String value) {
		Actions a = new Actions(driver);
		if (value.equalsIgnoreCase("draganddrop")) {
			a.dragAndDrop(element1, element2).build().perform();
		}
	}
	public static void Robot (int value ) throws AWTException{		
		Robot a = new Robot ();
		a.keyPress(value);
		a.keyRelease(value);

	}
	public static void simplealertss() {

		Alert a = driver.switchTo().alert();
		a.accept();
	}




}















































