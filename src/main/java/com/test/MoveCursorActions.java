package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveCursorActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement user = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		user.sendKeys("Admin");
		WebElement pswd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		pswd.sendKeys("admin123");

		WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		login.click();
		
		Actions a=new Actions(driver);
		WebElement admin = driver.findElement(By.xpath("//b[text()='Admin']"));
		WebElement org = driver.findElement(By.xpath("//a[text()='Organization']"));
		WebElement loc = driver.findElement(By.xpath("//a[text()='Locations']"));
		a.moveToElement(admin).moveToElement(org).moveToElement(loc).click().build().perform();
	}

}
