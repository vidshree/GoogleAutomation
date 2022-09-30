package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='abc123@gmail.com';");
		
		//js.executeScript("document.getElementById('txtUsername').value='Admin';");*/
		
	WebElement user = driver.findElement(By.xpath("//input[@name='email']"));
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='abc123@gmail.com';", user);
		
		
	}

}
