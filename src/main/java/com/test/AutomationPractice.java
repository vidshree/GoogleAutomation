package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement search = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		search.sendKeys("Dresses");
		WebElement button = driver.findElement(By.xpath("//button[@name='submit_search']"));
		button.click();
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
		email.sendKeys("abc123@gmail.com");
		WebElement button1 = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		button1.click();
		
	}

}
