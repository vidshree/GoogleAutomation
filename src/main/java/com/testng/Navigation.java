package com.testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {

	
@Test
	public static void backforwd() {
		
	System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	ChromeDriver driver=new  ChromeDriver();

	driver.get("https://www.snapdeal.com/");
	driver.get("https://www.amazon.com/");
	driver.navigate().to("https://www.amazon.com/");
	
     driver.navigate().back();
     driver.navigate().forward();
	
	
	}
}
