package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTst {
	
	@Test(groups= {"smoke","sanity"})
	public static void drop() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join\r\n");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement country= driver.findElement(By.xpath("//select[@id='country']"));
	Select s=new Select(country);
	//s.selectByIndex(2);
	s.selectByValue("BD");
	//s.selectByVisibleText("Australia");

	}

}
