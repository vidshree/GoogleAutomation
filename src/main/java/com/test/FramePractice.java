package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame1);
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("Vidya");
		
		
		

	}
	
}
