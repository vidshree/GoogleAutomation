package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LambDatatest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.lambdatest.com/register/");
		driver.manage().window().maximize();
		System.out.println( driver.getTitle());
		
		
		WebElement Fname = driver.findElement(By.xpath(" //input[@id='name']"));
		Fname.sendKeys("Narendra Modi");
		WebElement Email = driver.findElement(By.xpath(" //input[@name='email']"));
		Email.sendKeys("abc123@gmail.com");
		WebElement Pswd = driver.findElement(By.xpath("  //input[@name='password']"));
		Pswd.sendKeys("TestPassword");
		WebElement cell = driver.findElement(By.xpath("  //input[@name='phone']"));
		cell.sendKeys("9712886414");
        WebElement button=driver.findElement(By.xpath("//input[@name='i_agree']/../samp"));
		button.click();
		WebElement signup=driver.findElement(By.xpath("//button[@type='submit']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", signup);
	//	js2.executeScript("arguments[0].click();", login);
		
		
		

	}

}
