package com.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
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
		
		/*
		for(WebElement chbox: checkboxes)
		{
			chbox.click();
		}
		
		
		
		// Select multiple checkboxes by choice(Monday and Sunday)

		for(WebElement chbox: checkboxes)
		{
			String checkboxname=chbox.getAttribute("id");
			if(checkboxname.equals("Monday")|| checkboxname.equals("sunday"))
			{
				chbox.click();
			}
		}
		
		
		//Select  last 2 checkboxes
		int totalcheckboxes=checkboxes.size();
		
		for(int i =totalcheckboxes-2;i<totalcheckboxes ;i++)
		{
			checkboxes.get(i).click();
		}
		
		*/
		
	}

}
