package com.test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#\r\n");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement ele = driver.findElement(By.xpath("//button[@id='menu1']"));
		ele.click();
		
		List<WebElement> all=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		//List<WebElement> all = driver.findElements(By.xpath("//ul[@class='dropdown-menu']"));
		outer:
		for (WebElement each: all)
		{if(each.getText().equals("About Us")) 
	    	{ 
			each.click();
	    	break outer;
		 }
		}
		}


	}


