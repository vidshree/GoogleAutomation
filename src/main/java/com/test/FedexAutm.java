package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FedexAutm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.fedex.com/en-us/tracking.html");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		
	//	driver.findElement(By.xpath(xpathExpression))
		
		
		
		WebElement ele = driver.findElement(By.xpath("//button[@id='menu1']"));
		ele.click();
		
		List<WebElement> all=driver.findElements(By.xpath("//ul[@class='fxg-dropdown__list']/li/a"));
		outer:
		for (WebElement each:all)
		{if(each.getText().equals("Tracking")) 
	    	{ 
			each.click();
	    	break outer;
		 
		    }
		}
		
		
		
	}

}
