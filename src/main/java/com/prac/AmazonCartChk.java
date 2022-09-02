package com.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonCartChk  extends amazonsearch {

	@Test(dependsOnMethods= {"search"})
	public static void cart() throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();
Actions a=new Actions(driver);
WebElement acc = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
WebElement sign = driver.findElement(By.xpath("//span[text()='Sign in']"));
a.moveToElement(acc).moveToElement(sign).click().build().perform();

driver.findElement(By.xpath("//input[@name='email']")).sendKeys("srifrnd@gmail.com");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath(" //input[@name='password']")).sendKeys("Kashetty7$");
driver.findElement(By.xpath("//input[@type='submit']")).click();


Thread.sleep(3000);
 


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
