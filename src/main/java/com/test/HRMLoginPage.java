package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://amazon.com");
		
	JavascriptExecutor js=(JavascriptExecutor)driver;
	/*	String pageURL=js.executeScript("return document.URL;").toString();
		System.out.println(pageURL);
		*/
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	
		//window.location=myURL;
		//WebElement user = driver.findElement(By.name("txtUsername"));
		//user.sendKeys("Admin");
		//WebElement pwd = driver.findElement(By.id("txtPassword"));
		//pwd.sendKeys("admin123");
		//WebElement button = driver.findElement(By.className("button"));
		//button.click();
		//WebElement user = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		//user.sendKeys("Admin");
		//WebElement Pswd=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		//Pswd.sendKeys("admin123");
		//WebElement button= driver.findElement(By.xpath("//input[@class='button']"));
			//button.click();
		//driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
		
	/*	
		WebElement user = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("arguments[0].value='Admin';", user);
	
		
		WebElement user1 = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='admin123';", user1);
		js.executeScript("history.go(0)");
		
		
		WebElement login = driver.findElement(By.xpath("//input[@name='Submit']"));
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		//js2.executeScript("document.getElementById('btnLogin').click();");
		js2.executeScript("arguments[0].click();", login);
		*/
		
		String pageURL=js.executeScript("return document.URL;").toString();
		System.out.println(pageURL);
	
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		//js.executeScript("window.scrollBy(1000, 400)");
		//js.executeScript("window.scrollBy(0, 400)");//scroll window vertically
		
		//js.executeScript("window.scrollBy(10,0)"); //scroll window horizontally
	js.executeScript("window.scrollTo(0,600)");
	}
	

}
