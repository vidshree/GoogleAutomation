package com.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chkdays {
	@Test(alwaysRun=true)
	public static void chkbox() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".//driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		
		//Select specific check box
		WebElement days = driver.findElement(By.xpath("//input[@id='monday']"));
		days.click();

		
		//Select all the checkboxes
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("Total no of checkboxes:" + checkboxes.size());
		
		for (int i=0; i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
	}
}
