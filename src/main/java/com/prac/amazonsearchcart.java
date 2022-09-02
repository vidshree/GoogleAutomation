package com.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonsearchcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Backdrop Stand");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		WebElement result1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		String itemexpected = result1.getText();
		System.out.println("Item expected:" +itemexpected);

		result1.click();
		//String res=
	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Add to Cart']/../input")).click();// to click the item to cart
		
		
		Actions a=new Actions(driver);

		WebElement cart = driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")); //cart webelement
		
		a.moveToElement(cart).click().build().perform();
		
		
		WebElement result = driver.findElement(By.xpath("//span[@class='a-truncate-cut']"));
		String actualitem = result.getText();
		System.out.println("Actual cart item:" +actualitem);
		

		
		if(actualitem.contains(itemexpected))
		{
			System.out.println("matched");
		}
		else
		{
			System.out.println("didnt match");
		}


	}

}
