package com.test;

import org.testng.annotations.Test;

public class FruitsTestNg {
	
	@Test(priority=5)
	public void banana()
	{
		System.out.println("banana");
	}
	
	@Test(priority=4)
	public void apple()
	{
		System.out.println("apple");
	}
	
	
	@Test(priority=3)
	public void mango()
	{
		System.out.println("mango");
	}
	
	@Test(priority=1)
	public void kiwi()
	{
		System.out.println("kiwi");
	}
	
	
	@Test(priority=2)
	public void pineapple()
	{
		System.out.println("pineapple");
	}

}
