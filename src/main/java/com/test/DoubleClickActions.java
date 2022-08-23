package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions a =new Actions(driver);
		
		
		WebElement button= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		a.doubleClick(button).build().perform();
	   Alert abc=driver.switchTo().alert();
	   abc.accept();
	   Thread.sleep(4000);
	  WebElement buttonright = driver.findElement(By.xpath("//span[text()='right click me']"));
	  a.contextClick(buttonright).build().perform();
	   
	}
	

}
