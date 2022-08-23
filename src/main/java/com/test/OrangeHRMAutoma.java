package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRMAutoma {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		Actions a= new Actions(driver);
		Thread.sleep(3000);
	///JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		//js.executeScript("arguments[0].value='Admin';", uname);
		uname.sendKeys("Admin");
		
		
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		WebElement admin = driver.findElement(By.xpath("//span[text()='Admin']"));
	
		admin.click();
		Thread.sleep(3000);
		
		
		WebElement org = driver.findElement(By.xpath("//span[text()='Organization ']"));
		org.click();
		
		Thread.sleep(2000);
		WebElement loc = driver.findElement(By.xpath("//a[text()='Locations']"));
		loc.click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//div[@class='oxd-table-card'][1]")).click();
		//WebElement tablehead = driver.findElement(By.xpath("//div[@class='oxd-table-body']"));
		//driver.findElement(By.xpath("//div[@class='oxd-table-body']/div[0]/div/div")).click();
		
		
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]")).click();
		WebElement edit = driver.findElement(By.xpath("//i[@class='oxd-icon bi-pencil-fill']"));
		edit.click();
		Thread.sleep(3000);
	  WebElement send = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
		send.click();
		 send.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(2000);
		
		send.sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
