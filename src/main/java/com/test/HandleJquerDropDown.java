package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJquerDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		
		
		//selectChoiceValues(driver, "choice 1");
		
		//selectChoiceValues(driver, "choice 2", "choice 2 3", "choice 6", "choice 6 2 1");
		selectChoiceValues(driver,"all");
		

	}
	
	
	public static void selectChoiceValues(ChromeDriver driver, String... value)
	
	{
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement item:choiceList)
			{
				String text=item.getText();
				for(String val: value)
				{
					if(text.equals(val))
					{
						item.click();
						break;
						
					}
				}
			}
		}
		else
			{
			try
			{
				for(WebElement item: choiceList)
				{
					item.click();
				}
			}
			catch(Exception e)
			{
				
			}
		}
	}
}


