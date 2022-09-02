package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragTestNg {
@Test(invocationCount=2, invocationTimeOut=30000000)
	
	public static void dadp() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Actions a =new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement tgt = driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(src, tgt).build().perform();
	}

}
