package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	//	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
/*	WebElement alert1 = driver.findElement(By.xpath("//input[@name='alert']"));
		alert1.click();
		Thread.sleep(3000);
		Alert at1=driver.switchTo().alert();
		at1.accept();
		WebElement alert2 = driver.findElement(By.xpath("//input[@name='confirmation']"));
		alert2.click();
		Thread.sleep(3000);
		Alert at2=driver.switchTo().alert();
		at2.dismiss();
		
		WebElement alert = driver.findElement(By.xpath("//input[@name='prompt']"));
		alert.click();
		Thread.sleep(3000);
		Alert at=driver.switchTo().alert();
		Thread.sleep(3000);
		at.sendKeys("Vidya");
		Thread.sleep(3000);
		at.accept();
		
		//https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt*/
		driver.switchTo().frame("iframeResult");
		WebElement alert2 = driver.findElement(By.xpath("//button[text()='Try it']"));
		alert2.click();
		Thread.sleep(3000);
		Alert at2=driver.switchTo().alert();
		at2.sendKeys("Vidya");
		at2.accept();
		//driver.switchTo().frame(frameapla);
		


	}

}
