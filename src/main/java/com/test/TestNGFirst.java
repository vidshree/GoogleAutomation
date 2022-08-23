package com.test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGFirst {

	@BeforeTest
	public void mango() {
		System.out.println("Hello, I am Mango");
	}
@Test
	public void sapota()
	{
		System.out.println("Hello, i am sapota");
	}
}


