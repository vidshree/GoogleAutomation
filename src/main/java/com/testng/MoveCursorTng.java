package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveCursorTng {
	
	@Test(groups= {"smoke"})
	public static void cursor() throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		//js.executeScript("arguments[0].value='Admin';", uname);
		uname.sendKeys("Admin");
		
		
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	/*	
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		WebElement admin = driver.findElement(By.xpath("//b[text()='Admin']"));
		WebElement org = driver.findElement(By.xpath("//a[text()='Organization']"));
		WebElement loc = driver.findElement(By.xpath("//a[text()='Locations']"));
		a.moveToElement(admin).moveToElement(org).moveToElement(loc).click().build().perform();*/
	}

}
