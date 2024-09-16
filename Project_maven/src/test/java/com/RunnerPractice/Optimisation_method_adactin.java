package com.RunnerPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Optimisation_method_adactin {

	public static WebDriver driver;

	public static void Launchbrowser() {

		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.adactinhotelapp.com");

	}

	public static void Setusername() {
		driver.findElement(By.id("username")).sendKeys("Asik232425");

	}
	public static void setpassword_and_Login() {
		driver.findElement(By.id("password")).sendKeys("1234567"+Keys.ENTER);

	}
	public static void Location() {
		WebElement location = driver.findElement(By.id("location"));
		Select loca = new Select(location);
		loca.selectByVisibleText("Paris");
	}

	public static void Hotel() {
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select hotel = new Select(hotels);
		hotel.selectByIndex(2);
	}

	public static void Roomtype() {
		WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select ro = new Select(roomtype);
		ro.selectByIndex(4);

	}

	public static void RoomNum() {
		WebElement rooms = driver.findElement(By.id("room_nos"));
		Select room = new Select(rooms);
		room.selectByIndex(3);

	}

	public static void SetIndate() throws AWTException {
		WebElement date = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		date.sendKeys("05/10/2023");
		date.click();

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		date.sendKeys("05/10/2023");
	}

	public static void Setoutdate() throws AWTException {
		WebElement outdate = driver.findElement(By.name("datepick_out"));
		outdate.sendKeys("08/10/2023");
		outdate.click();

		Robot outda = new Robot();
		outda.keyPress(KeyEvent.VK_CONTROL);
		outda.keyPress(KeyEvent.VK_A);
		outdate.sendKeys("08/10/2023");
	}

	public static void Adults() {
		WebElement adults = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select adult = new Select(adults);
		adult.selectByIndex(2);
	}

	public static void Childs() throws InterruptedException {
		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select chil = new Select(child);
		chil.selectByIndex(1);
	}

	public static void Click_and_nextpage() {
		WebElement clicksearch = driver.findElement(By.xpath("//input[@id='Submit']"));
		clicksearch.click();
	}

	public static void Hotelsunshine() {
		WebElement hotelsunshine = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		hotelsunshine.click();
	}

	public static void ClickNext() {
		WebElement next = driver.findElement(By.xpath("//input[@id='continue']"));
		next.click();
	}
	public static void Setname() {
		driver.findElement(By.id("first_name")).sendKeys("Asiafi");

	}

	public static void setlastname() {
		driver.findElement(By.id("last_name")).sendKeys("Ashfi");

	}

	public static void Setaddress() {
		driver.findElement(By.id("address")).sendKeys("2/11,North_street_paris");

	}


	public static void Creditcardnum() {
		driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("5649846285137892");

	}

	public static void Selectcard() {
		WebElement cards = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select card = new Select(cards);
		card.selectByIndex(1);
	}

	public static void CardExpirymonth() {
		WebElement expirydate = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select expiry = new Select(expirydate);
		expiry.selectByValue("8");
	}


	public static void cardexpyear() {
		WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select yr = new Select(year);
		yr.selectByIndex(18);
	}

	public static void SetCvvnum() {
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("254");

	}

	public static void Bookingdone() {
		driver.findElement(By.xpath("//input[@id='book_now']")).click();

	}
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	public static void Bookingclick() {
		driver.findElement(By.id("my_itinerary")).click();

	}




	public static void main(String[] args) throws AWTException, InterruptedException {


		Launchbrowser();
		Setusername();
		setpassword_and_Login();
		Location();
		Hotel();
		Roomtype();
		RoomNum();
		SetIndate();
		Setoutdate();
		Adults();
		Childs();
		Click_and_nextpage();
		Hotelsunshine();
		ClickNext();
		Setname();
		setlastname();
		Setaddress();
		Creditcardnum();
		Selectcard();
		CardExpirymonth();
		cardexpyear();
		SetCvvnum();
		Bookingdone();
		Bookingclick();



















	}




}

