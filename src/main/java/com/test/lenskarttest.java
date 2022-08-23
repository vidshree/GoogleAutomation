package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lenskarttest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://lenskart.us/account/login");
		driver.manage().window().maximize();
		System.out.println("Title of the web page is: " +driver.getTitle());
		System.out.println("Current URL of the web page is: " +driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		//System.out.println(driver.getCurrentUrl());
		//WebElement user = driver.findElement(By.name("customer[email]"));
		//user.sendKeys("mounaren718@gmail.com");
		//WebElement pwd=driver.findElement(By.id("CustomerPassword"));
		//pwd.sendKeys("kashetty");
		//WebElement button = driver.findElement(By.className("btn"));
		//button.click();
       //WebElement user=driver.findElement(By.xpath("//input[@name= 'customer[email]']"));
		//user.sendKeys("mounaren718@gmail.com");
		//Thread.sleep(4000);
	   //WebElement Pswd=driver.findElement(By.xpath("//input[@id= 'CustomerPassword']"));
			//Pswd.sendKeys("kashetty");
	    //driver.findElement(By.xpath("//input[@value= 'btn has_loading_icon']")).click();
		
		
		
			

	}
	

}
