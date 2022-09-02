package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class IteraTestQA {
	@Test

	public static void testqa() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
	
		
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Vidya");
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9184562354");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("#12, Sw bucke street, oregon");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		//driver.findElement(By.xpath("//input[@id='male']")).click();
		Actions a =new Actions(driver);
		WebElement chkbox = driver.findElement(By.xpath("//input[@id='monday']"));
		a.moveToElement(chkbox).click().build().perform();;
		
		
		
		
	}		
		
		
		
		
		
		
	

}
