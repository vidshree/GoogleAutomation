package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Axesxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vidya/OneDrive/Desktop/Testing%20Training/trial.html");	
	System.out.println(driver.getCurrentUrl());
	
	WebElement  ver = driver.findElement(By.xpath("//div[@class='Vertebrate']"));
	ver.click();
	
		

	}

}
