package com.prac;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class OrangeHRMAssertion {
	
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		//System.out.println(driver.getCurrentUrl());
		String Url=driver.getCurrentUrl();
		String webUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/logi";
		//Assert.assertTrue(webUrl.equals(Url));
		SoftAssert s=new SoftAssert();
		s.assertTrue(webUrl.equals(Url));
	
	//	Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);

		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		
		uname.sendKeys("Admin");
		
		
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}