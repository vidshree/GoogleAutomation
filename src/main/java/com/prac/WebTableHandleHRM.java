package com.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandleHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		/*WebElement tablehead = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		
List<WebElement> rows = tablehead.findElements(By.tagName("tr"));
		
		outer:
		for(int i=1; i<rows.size();i++)
		{
		List<WebElement> columns=rows.get(i).findElements(By.tagName("td"));
		for(int j=0;j<columns.size();j++)
		{
			String value=columns.get(j).getText();
			{
				if(value.equals("Taiwan"))
				{
					System.out.println(columns.get(3).getText());
					break outer;
				}
				
				
				
			}
		}
		}
*/
		WebElement tablehead = driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> rows = tablehead.findElements(By.tagName("tr"));
		outer:
			for(int i=1;i<=rows.size();i++)
			{
				 List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
				 
							 {for(int j=0;j<columns.size();j++)
				 {
					 String value=columns.get(j).getText();
								 if(value.equals("Yoshi Tannamuri"))
								 {
									 System.out.println(columns.get(0).getText());
									 break outer;
								 }
							 }
				 }
		
			}
		
		
		
		
	}

}
