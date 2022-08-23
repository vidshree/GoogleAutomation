package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	//	WebElement link =driver.findElement(By.linkText("Forgot your password?"));
	//	link.click();
	
		//WebElement link =driver.findElement(By.partialLinkText("Forgot "));
		//	link.click();
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys("Narendra");
		WebElement lname = driver.findElement(By.xpath("//input[@name='firstname']/following::input"));
		lname.sendKeys("Est");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='lastname']/following::input"));
		email.sendKeys("9712806414");
		WebElement pswd= driver.findElement(By.xpath("//input[@name[starts-with( .,'reg_passwd__')]]"));
		pswd.sendKeys("facebook@123");
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		year.sendKeys("2000");
		WebElement gender= driver.findElement(By.xpath("//input[@name='sex'][1]"));
		gender.click();
		WebElement sign= driver.findElement(By.xpath("//button[@name='websubmit']"));
		sign.click();
		
		
		
				
		


	}

}
