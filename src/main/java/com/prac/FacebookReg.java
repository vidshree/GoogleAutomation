package com.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookReg {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_US&display=page");
		driver.manage().window().maximize();
		//System.out.println(driver.getCurrentUrl());
		WebElement gender= driver.findElement(By.xpath("//label[text()='Female']"));
		System.out.println(gender.isDisplayed());
		gender.click();
		System.out.println(gender.isSelected());
		gender.click();
		System.out.println(gender.isEnabled());
		
	}

}
