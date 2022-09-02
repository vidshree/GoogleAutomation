package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedFramesPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
//driver.get("https://demo.guru99.com/test/radio.html");
driver.get("https://www.spicejet.com/");
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());

WebElement currency = driver.findElement(By.xpath("//div[text()='INR']"));


Select s=new Select("currency"); Select s=new Select
s.selectByValue("AED");



//WebElement radio1 = driver.findElement(By.xpath("//input[@name='webform'][2]"));
//radio1.click();

/*driver.switchTo().frame("frame1");
WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
text.sendKeys("Hello");
*/




	}

}
