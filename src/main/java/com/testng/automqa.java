package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class automqa extends chkdays{
	
	@Test(alwaysRun=true)
	public static void chkboxes() {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));
		fname.sendKeys("vidya");
		WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lname.sendKeys("shree");
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("mounaren718@gmail.com");
		WebElement Gender = driver.findElement(By.xpath("//label[text()='Female']"));
		Gender.click();
		WebElement phno = driver.findElement(By.xpath("//input[@id='userNumber']"));
		phno.sendKeys("123456789");
		//driver.findElementByClassName(By.xpath("))
	//    WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	   
		//dob.sendKeys("1 March 1986");
		WebElement hobby = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
		hobby.click();
		
		
		
		
		
	}

}
