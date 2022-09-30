package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMWindowHandle {
	public static  Set<String> all;
	public static Iterator<String> it;
	public static String parent, linkedIn, facebook, twitter, youtube;
	
	public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.manage().window().maximize();
	parent=driver.getWindowHandle();
	Thread.sleep(2000);
	System.out.println(parent);
	WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
	user.sendKeys("Admin");
	WebElement pswd = driver.findElement(By.xpath("//input[@name='password']"));
	pswd.sendKeys("admin123");
	WebElement link = driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
	link.click();
	
	all=driver.getWindowHandles();
	it=all.iterator();
	while(it.hasNext())
	{
		linkedIn= it.next();
		if(!parent.equals(linkedIn))
		{
			driver.switchTo().window(linkedIn);
		
		}
	}
	
	System.out.println(driver.getTitle());
	WebElement email=driver.findElement(By.xpath("//input[@name='email-address']"));
	email.sendKeys("Vidya123@gmail.com");
	driver.switchTo().window(parent);
	System.out.println(driver.getTitle());
	Thread.sleep(3000);

WebElement fb=driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']"));
fb.click();
all=driver.getWindowHandles();
it=all.iterator();
while(it.hasNext())
{
	facebook=it.next();
	if(!parent.equals(facebook))
	{ 
		driver.switchTo().window(facebook);
	}
}
Thread.sleep(3000);
	
System.out.println(driver.getCurrentUrl());
driver.switchTo().window(parent);
System.out.println(driver.getTitle());
Thread.sleep(3000);

WebElement twt = driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']"));
twt.click();
all=driver.getWindowHandles();
it=all.iterator();
while(it.hasNext()) {
	twitter=it.next();
	if(!parent.equals(twitter))
	{
		driver.switchTo().window(twitter);
	}
	
}
Thread.sleep(3000);

System.out.println(driver.getCurrentUrl());

driver.switchTo().window(parent);


WebElement ytube = driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']"));
ytube.click();

all=driver.getWindowHandles();
it=all.iterator();
while(it.hasNext())
{
	youtube=it.next();
	if(!parent.equals(youtube))
	{
		driver.switchTo().window(youtube);
	}
}

System.out.println(driver.getCurrentUrl());
driver.switchTo().window(parent);

	
	}
}
