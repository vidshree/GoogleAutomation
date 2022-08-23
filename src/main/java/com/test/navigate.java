package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver=new  ChromeDriver();

	//driver.get("https://www.snapdeal.com/");
	//driver.get("https://www.amazon.com/");
	driver.navigate().to("https://www.amazon.com/");
	
     driver.navigate().back();
     driver.navigate().forward();
	
	
	}

}
