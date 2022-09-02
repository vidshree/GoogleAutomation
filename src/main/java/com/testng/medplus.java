package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class medplus {
	
@Test(groups= {"smoke"})
	public static void frame()
	{
	System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://demo.automationtesting.in/Frames.html");
	
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	driver.switchTo().frame(frame1);
	WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
	input.sendKeys("Vidya");
	
	}

}
