package com.simpleannotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnotation {



	@Test	
	public void Afi() {
		System.out.println("Afii");
	}
	
	@BeforeMethod
	public void Beforemethodtestcase() {
		System.out.println("Beforemethod");
	}

	@BeforeClass
	public void Beforeclass() {
		System.out.println("Beforeclass");
	}

	@BeforeTest
	public void Test1() {
		System.out.println("Zarin");
	}

	@BeforeSuite
	public void Aftermethodtestcase() {
		System.out.println("Suite");
	}

	@AfterMethod
	public  void Aftermethod() {
		System.out.println("Aftermethod");
	}

	@AfterClass
	public void Afterclass() {
		System.out.println("Afterclass");
	}

	@AfterTest
	public void Aftertest() {
		System.out.println("Aftertest");
	}

	@AfterSuite
	public void Aftersuite() {
		System.out.println("Aftersuite");
	}



}
