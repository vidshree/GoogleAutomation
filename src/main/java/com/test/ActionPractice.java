package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Actions a= new Actions(driver);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		//a.moveToElement(email).sendKeys("Vidya").build().perform();
		a.sendKeys(email, "Vidya").build().perform();
		
		
		//to Click the button
		
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		//a.moveToElement(button).click().build().perform();
		a.click(button).build().perform();
		
		
		
	}

}
