package com.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class amazonsearch {

	public static String itemexpected;
	@Test
	public static void search(){
		// TODO Auto-generated method stub
	
	
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Actions a=new Actions(driver);
		WebElement acc = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		WebElement sign = driver.findElement(By.xpath("//span[text()='Sign in']"));
		a.moveToElement(acc).moveToElement(sign).click().build().perform();
		
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("srifrnd@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath(" //input[@name='password']")).sendKeys("Kashetty7$");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Backdrop Stand");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		WebElement result1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		String itemexpected = result1.getText();
		System.out.println("Item expected:" +itemexpected);

		result1.click();
		
	
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		
		

		WebElement cart = driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
		a.moveToElement(cart).click().build().perform();




	}

}
