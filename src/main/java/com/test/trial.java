package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe"); //System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		 //	ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.com/");
		driver.get("https://www.fedex.com/en-us/home.html");
		driver.manage().window().maximize();
		System.out.println("Title of the website" +driver.getTitle());
		System.out.println("Current URL of the website" +driver.getCurrentUrl());
		
	//	WebElement to = driver.findElement(By.xpath("//input[@id='search']"));
	//	to.sendKeys("Girls leggings");
	//	WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	//button.click();
	
/*
		WebElement ele = driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"));
	ele.click();
 WebElement s = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
 Select a= new Select(s);
// a.selectByValue("search-alias=alexa-skills");
 
 //a.selectByVisibleText("Amazon Warehouse");
 a.selectByIndex(4);
	

	WebElement seconelemnt = driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
	seconelemnt.click();
	
	List<WebElement> all=driver.findElements(By.xpath("//ul[@class='hmenu hmenu-visible']/li/a"));
	outer:
	for (WebElement each: all)
	{if(each.getText().equals("Best Sellers")) 
    	{ 
		each.click();
    	break outer;
	 }

	}
 
 WebElement a= driver.findElement(By.xpath("//a[@class='nav_a']"));
 a.click();
		
		//WebElement a2 = driver.findElement(By.linkText("Ring"));
		//a2.click();
		*/
 
		WebElement ele1 = driver.findElement(By.xpath("//a[@class='fxg-link fxg-dropdown-js  fxg-keyboard']"));
		ele1.click();
		

}
}
