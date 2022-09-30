package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesGuru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/guru99home");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		/*driver.switchTo().frame("a077aa5e"); //switching the frame by ID

		System.out.println("********We are switch to the iframe*******");
 		driver.findElement(By.xpath("html/body/a/img")).click();
		    //Clicks the iframe
   
			System.out.println("*********We are done***************");*/
		
		int size = driver.findElements(By.tagName("iframe")).size();

	    for(int i=0; i<=size; i++){
		driver.switchTo().frame(i);
		int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println(total);
	    driver.switchTo().defaultContent();

	}

}
	}
