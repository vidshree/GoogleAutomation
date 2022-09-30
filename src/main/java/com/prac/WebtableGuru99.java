package com.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableGuru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		WebElement tableHead = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		/*
		List<WebElement> rows = tableHead.findElements(By.tagName("tr"));
		outer:
			for(int i=1;i<rows.size();i++)
			{
				List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
				for(int j=i;j<col.size();j++)
				{
					
				
					System.out.println(col.get(j).getText());
					break outer;
					
				}
			}
		
		*/
		
		 WebElement tableRow = tableHead.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
         String rowtext = tableRow.getText();
		 System.out.println("Third row of table : "+rowtext);
		    
		    //to get 3rd row's 2nd column data
		    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		    String valueIneed = cellIneed.getText();
		    System.out.println("Cell value is : " + valueIneed); 
				
		
		

	}

}
