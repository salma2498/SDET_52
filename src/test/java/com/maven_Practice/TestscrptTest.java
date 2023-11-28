package com.maven_Practice;

import org.testng.annotations.Test;

public class TestscrptTest {
	@Test(groups = "smoke")
	public void tests1()
	{
		System.out.println("---Testscript-1---");
	}
	@Test(groups = "regression")
	public void tests2()
	{
		System.out.println("---Testscript-2---");
	}
	@Test(groups = "smoke")
	public void tests3()
	{
		System.out.println("---Testscript-3---");
	}



}
