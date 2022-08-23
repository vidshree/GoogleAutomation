package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MedplusTest {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		WebElement user=  driver.findElement(By.id("txtUsername"));
		user.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		WebElement button = driver.findElement(By.className("button"));
		button.click();
	}

}
