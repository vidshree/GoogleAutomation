package com.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionizeWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.com");
		driver.get("https://www.functionize.com/free-trial");
		
		driver.manage().window().maximize();

		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vidya");
		

	}

}
