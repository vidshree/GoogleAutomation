package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://sqengineer.com/practice-sites/practice-tables-selenium/");
		driver.manage().window().maximize();
	/*	WebElement tablehead = driver.findElement(By.xpath("//table[@id='table1']"));
		List<WebElement> rows = tablehead.findElements(By.tagName("tr"));
		outer:
		for(int i=1;i<=rows.size();i++)
		{
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			{
	
				for(int j=0;j<col.size();j++)
			{
				String value=col.get(j).getText();
				if(value.equals("Selenium"))
				{
					col.get(2).click();
					//driver.get(value1);
					
					break outer;
				}
			}
				
				
			 
		}
		
		}*/
		
		WebElement tabhead = driver.findElement(By.xpath("//*[@id=\"table2\"]"));
	List<WebElement> rows = tabhead.findElements(By.tagName("tr"));
	
	outer:
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			{
				for(int j=0;j<col.size();j++)
				{
					String val=(col.get(j).getText());
					{
						if(val.equals("Badminton"))
						{
						System.out.println(col.get(2).getText());
						j++;
						break outer;
					}
					
				}
				
			}
		}
		
	
		
		
		}
	}
}

		
		
		



