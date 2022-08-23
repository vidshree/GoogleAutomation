package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmJavaScript {
	
	public static void flash(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js5= (JavascriptExecutor)driver;
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<10;i++) {
			changeColor("#00000", element,driver);
			changeColor(bgcolor, element, driver);
		}
		
	}

	private static void changeColor(String color, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js5= (JavascriptExecutor)driver;
		js5.executeScript("arguments[0].style.backgroundColor= '"+color +"' ",  element);
		
		try
		{
		Thread.sleep(20);
		
		}
		catch(InterruptedException e)
		{
			
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		WebElement border = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		
		//Draw Border
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", border);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\pics\\logo.png");
				FileUtils.copyFile(src, trg);
				
	  
		//To return the title of the webpage
				
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		String title=js1.executeScript("return document.title;").toString();
		System.out.println(title);
		
		
		//to click the webelement
		WebElement reg = driver.findElement(By.xpath("//a[@class='ico-register']"));
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("arguments[0].click();", reg);
		
		
		//scroll down
		JavascriptExecutor js4=(JavascriptExecutor)driver;
	//js4.executeScript("window.scrollTo(500,500)");
		js4.executeScript("document.body.style.zoom='110%'");
			
		

	}

}
