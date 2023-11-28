package com.maven_Practice;

import org.testng.annotations.Test;

public class Githubtest {
	@Test
	public void test()
	{
		System.out.println("Hi");
	}
	@Test
	public void testu()
	{
		System.out.println("I am ");
	}
	@Test(groups = "smoke")
	public void testsu()
	{
		System.out.println("Umme salma");
	}

}
