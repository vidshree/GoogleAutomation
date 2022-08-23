package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/seeker/registration");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement name = driver.findElement(By.xpath("//input[@name='fullname']"));
		name.sendKeys("Vidya");
		WebElement mail = driver.findElement(By.xpath("//input[@name='email']"));
		mail.sendKeys("random@gmail.com");
		WebElement pswd = driver.findElement(By.xpath("//input[@name='Password']"));
		pswd.sendKeys("starabc");
		
		WebElement country = driver.findElement(By.xpath("//select[@class='countryCodes']"));
		Select s=new Select(country);
		s.selectByValue("91");
		
		WebElement num= driver.findElement(By.xpath("//input[@name='Mobile Number']"));
		num.sendKeys("9045478457");
		
		
		WebElement loc = driver.findElement(By.xpath("//input[@name='location']"));
	loc.sendKeys("India");	
		
		
		
		WebElement button = driver.findElement(By.xpath("//div[@class='multiselect__select modal-ref-class']"));
		button.click();
	//	WebElement ele = driver.findElement(By.xpath("//span[text()='Select experience (e.g. Fresher or Experience)']/following::ul[1]/li/span/span/span"));
		
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='multiselect__content ddn-scrollable modal-ref-class']//li/span/span/span"));
		outer:
		for(WebElement each: all)
		{ 
			if (each.getText().equals("1 Year"))
			{
				each.click();
				break outer;

		}
		
		
		
	//	xpath=//span[text()='Select experience (e.g. Fresher or Experience)']/following::ul[1]/li/span/span/span

	}

	}
}
