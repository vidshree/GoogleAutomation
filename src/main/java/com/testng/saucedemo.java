package com.testng;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {

	@Test
	public static void saucelogin() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	
		
		
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		
}

}