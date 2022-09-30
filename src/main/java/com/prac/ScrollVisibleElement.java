package com.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollVisibleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/guru99home");
        driver.manage().window().maximize();
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement ele = driver.findElement(By.xpath("//i[@class='icon-linux']"));
        //js.executeScript("arguments[0].scrollIntoView();", ele);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
