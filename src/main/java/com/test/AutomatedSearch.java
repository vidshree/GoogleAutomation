package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.bing.com/");
driver.manage().window().maximize();

WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
search.sendKeys("Selenium");
List<WebElement> list = driver.findElements(By.xpath("//li[@class='sa_sg']"));

System.out.println("size of Auto Suggetion:"+list.size());
	for(WebElement listitem:list)
	{
		if(listitem.getText().equals("selenium testing"))
			listitem.click();
		break;
	}
	
	}

}
