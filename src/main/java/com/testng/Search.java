package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Search {

	@Test(groups= {"sanity", "regression"})
	public static void medplussearch()
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.com");
		driver.get("https://www.medplusmart.com/");
		
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//input[@id='enterval']"));
		a.moveToElement(ele).click().sendKeys("Dolo650",Keys.ENTER).build().perform();
		
		/*WebElement healthstr = driver.findElement(By.xpath("//a[@title='Health Store']/parent::li"));
		Thread.sleep(3000);
		WebElement baby = driver.findElement(By.xpath("//a[@title='Baby Needs']/.."));
		Thread.sleep(3000);
		WebElement wipes= driver.findElement(By.xpath("//a[@title='Baby Wipes']"));
		Thread.sleep(3000);
		a.moveToElement(healthstr).moveToElement(baby).moveToElement(wipes).click().build().perform();*/
	
	}

}
