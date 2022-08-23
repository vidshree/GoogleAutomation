package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame1);
		WebElement input = driver.findElement(By.xpath("//b[@id='topic']/../input"));
		input.sendKeys("Vidya");
		driver.switchTo().defaultContent();	
		
		
		driver.switchTo().frame("frame2");
		
	//	WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"))
		
		WebElement animal= driver.findElement(By.xpath("//select[@id='animals']"));
		Select s=new Select(animal);
		s.selectByValue("big baby cat");
		
		driver.switchTo().defaultContent();	
		
	

		driver.switchTo().frame("frame1").switchTo().frame("frame3");
		WebElement chkbx = driver.findElement(By.xpath("//input[@id='a']"));
		chkbx.click();

		
		
	}

}
