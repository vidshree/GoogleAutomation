package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lenskart {
@Test(alwaysRun=true)

	public static void lenslogin()  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://lenskart.us/account/login");
		driver.manage().window().maximize();
		System.out.println("Title of the web page is: " +driver.getTitle());
		System.out.println("Current URL of the web page is: " +driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		//System.out.println(driver.getCurrentUrl());
		WebElement user = driver.findElement(By.name("customer[email]"));
		user.sendKeys("mounaren718@gmail.com");
		WebElement pwd=driver.findElement(By.id("CustomerPassword"));
		pwd.sendKeys("kashetty");
		WebElement button = driver.findElement(By.className("btn"));
		button.click();

	}
}
