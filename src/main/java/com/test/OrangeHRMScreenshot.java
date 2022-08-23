package com.test;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;


public class OrangeHRMScreenshot {
	public static ChromeDriver driver;
	public static int i=0;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		 driver=new ChromeDriver();
		 OrangeHRMScreenshot hm=new  OrangeHRMScreenshot();
		 
	    driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
		
		WebElement user = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		user.sendKeys("Admin");
		hm.snap();
		
		WebElement pswd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		pswd.sendKeys("admin123");
		hm.snap();
		WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		login.click();
		hm.snap();
		  

	}
	
	
	public void snap() throws IOException 
	{
		
		Random r=new Random();
		if(r.nextInt()!=0)
		{
			i=i+1;
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File(".//pics//img " +i+ ".png");
			FileUtils.copyFile(src,dest);
			
		}
	}

}
