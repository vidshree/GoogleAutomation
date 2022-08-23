package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnimalsTestNg {
	
	@Test
	public void dog()
	{
		System.out.println(" I am Dog");
	}

	@AfterMethod
	public void cat()
	{
		System.out.println(" I am cat");
	}
	
	@BeforeMethod
	public void horse()
	{
		System.out.println(" I am Horse");
	}
	
	@AfterClass
	public void lion()
	{
		System.out.println(" I am lion");
	}
	
	@BeforeClass
	public void tiger()
	{
		System.out.println(" I am tiger");
	}
	
	@AfterTest
	public void zebra()
	{
		System.out.println(" I am zebra");
	}
	
	
	@BeforeTest
	public void pig()
	{
		System.out.println(" I am pig");
	}
	
	
	@AfterSuite
	public void giraffe()
	{
		System.out.println(" I am giraffe");
	}
	
	
	@BeforeSuite
	public void cow()
	{
		System.out.println(" I am cow");
	}
	
	@Test
	public void buffalo()
	{
		System.out.println(" I am buffalo");
	}
	
	
}
