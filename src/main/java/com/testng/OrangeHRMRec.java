package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRMRec {
	
	@Test
	@Parameters({"userdata", "passwordata"})
	public  void orangeLogin(String data1, String data2) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data1);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data2);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
			
		
		
		
	}

}
