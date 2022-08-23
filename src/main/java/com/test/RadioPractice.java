package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.getProperty("webdriver.chrome.driver",".//drivers//chromedrivers.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		
		
		
		
	}

}
