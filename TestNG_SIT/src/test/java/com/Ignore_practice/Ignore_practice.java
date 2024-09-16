package com.Ignore_practice;

import org.testng.annotations.Test;

public class Ignore_practice {

	@Test
	public void CTestcase1() {
		System.out.println("Test case 1");
	}


	@Test
	public void BTestcase2() {

		System.out.println("Test case 2");


	}
	@Test(enabled = false)
	public void ATestcase3() {

		System.out.println("Test case 3");


	}















}










