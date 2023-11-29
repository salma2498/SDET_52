package com.maven_Practice;

import org.testng.annotations.Test;

public class Testscript2Test {
	@Test(groups = "smoke")
	public void tests4()
	{
		System.out.println("---Testscript-4---");
	}
	@Test(groups = "regression")
	public void tests5()
	{
		System.out.println("---Testscript-5---");
	}
	@Test(groups = "smoke")
	public void tests6()
	{
		System.out.println("---Testscript-6---");
		System.out.println("hi");
		
	}


}

