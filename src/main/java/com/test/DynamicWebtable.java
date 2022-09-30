package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
				driver.get("https://testuserautomation.github.io/WebTable/");
		// Method 1
		/*String before_xpath = "//table/tbody/tr["; String after_xpath = "]/td[2]";
		List rows = driver.findElements(By.xpath("//table/tbody/tr"));
		int rowSize = rows.size();
		System.out.println(rowSize);
		for (int i = 2; i <= rowSize; i++) {
		String firstNames = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
		System.out.println(firstNames);
		// Now click the checkBox where first Name would be Will
		if (firstNames.contains("Will")) {
		// click the checkBox
		driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]/input")).click(); System.out.println("candidate has been selected");
		break;
		}
		}*/
		//Method 2 : By custom xpath:
	driver.findElement(By.xpath("//td[contains(text(),'JackMan')]//preceding-sibling::td//input[@type='checkbox']")) .click();
			
				
				/*List<WebElement> rows = driver.findElements(By.tagName("tr"));
				outer:
				for(int i=0;i<rows.size();i++)
				{
					List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
					for(int j=1;j<cols.size();j++)
					{
						String value=cols.get(j).getText();
						if(value.equals("Will"))
						{
						//System.out.println(cols.get(2).getText());
						cols.get(0).click();
						driver.findElement(By.xpath("//input[@type='checkbox']")).click();
						break outer;
						}
					}
				}
	*/

				
										
					
					
							
	}

}
