package com.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.com");
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		Actions a= new Actions(driver);
		
		WebElement frameID = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameID);
		//driver.switchTo().frame(frame1);
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		a.keyDown(Keys.CONTROL).moveToElement(item1).click().moveToElement(item3).click().moveToElement(item5).click().moveToElement(item7).click().keyUp(Keys.CONTROL).build().perform();
		

	}

}
