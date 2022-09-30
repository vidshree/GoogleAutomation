package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://sqengineer.com/iframes");
		driver.manage().window().maximize();
		
		WebElement frme = driver.findElement(By.xpath("//iframe[@id='iframe1']"));
		driver.switchTo().frame(frme);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vid");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("sri");
		driver.findElement(By.xpath("//input[@id='femaleGender']")).click();
		driver.findElement(By.xpath("//input[@id='country']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc123@gmail.com");
		WebElement city = driver.findElement(By.xpath("//select[@id='selectBox']"));
		Select s= new Select(city);
		s.selectByIndex(1);
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframe2']")));
		//WebElement frme1 = driver.findElement(By.xpath("//iframe[@id='iframe2']"));
		//driver.switchTo().frame(frme1);
		
		WebElement tablehead = driver.findElement(By.xpath("//table[@id='table1']"));
		 List<WebElement> rows = tablehead.findElements(By.tagName("tr"));
		 outer:
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			{
				for(int j=0;j<col.size();j++)
				{
					String val=(col.get(j).getText());
					{
						if(val.equals("UFT"))
						{
						System.out.println(col.get(1).getText());
						
						break outer;
						}
					}
		
		
	}

}
		}
	}
}

