package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://trailhead.salesforce.com/today");
		/*driver.get("https://trailhead.salesforce.com/");
        driver.findElement(By.xpath("//button[text()='Get Started for Free']")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.xpath("//input[@name='loginPage:email-card-form:emailTextInput']")).sendKeys("vidyashreenarendra.e@gmail.com");
        driver.findElement(By.xpath("//button[@id='submit-email']")).click();
		//driver.findElement(By.xpath("//input[@name='loginPage:email-card-form:challengeTextInput']")).sendKeys("552773");
	*/
	}

}
