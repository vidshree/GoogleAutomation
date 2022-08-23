package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownsecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver\r\n");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement product = driver.findElement(By.xpath("//select[@id='first']"));
		Select s=new Select(product);
		//s.selectByIndex(1);
		s.selectByValue("Apple");
		//s.selectByVisibleText("Bing");
		
		WebElement animals= driver.findElement(By.xpath("//select[@id='animals']"));
		Select a=new Select(animals);
		a.selectByValue("avatar");
		
		WebElement food = driver.findElement(By.xpath("//select[@id='second']"));
		Select f=new Select(food);
	//	f.selectByIndex(1);
		f.selectByValue("bonda");
		//f.deselectByValue("bonda");
		//f.selectByVisibleText("Pizza");
		f.deselectAll();
		
		
	}

}
