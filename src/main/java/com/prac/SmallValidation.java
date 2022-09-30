package com.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SmallValidation {
	@Test
	public void qa() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		//System.out.println(driver.getCurrentUrl());
		WebElement gender= driver.findElement(By.xpath("//label[text()='Male']"));
		System.out.println(gender.isDisplayed());
		gender.click();
		System.out.println(gender.isSelected());
		System.out.println(gender.isEnabled());
		
		
	}
}
