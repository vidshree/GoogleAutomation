package com.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload");
//driver.get("https://www.monsterindia.com/seeker/registration");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement upload = driver.findElement(By.xpath("//input[@class='upload_txt']"));
		//WebElement upload = driver.findElement(By.xpath("//span[@class='browse-text']"));
		//upload.click();
		upload.sendKeys("C:\\Testing\\cover letter.pdf");
		
		

	}

}
