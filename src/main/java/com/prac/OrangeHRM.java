package com.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		Actions a= new Actions(driver);
		Thread.sleep(3000);
	///JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		//js.executeScript("arguments[0].value='Admin';", uname);
		uname.sendKeys("Admin");
		
		
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		WebElement admin = driver.findElement(By.xpath("//span[text()='Admin']"));
	
		admin.click();
		Thread.sleep(3000);
		
		
		WebElement org = driver.findElement(By.xpath("//span[text()='Organization ']"));
		org.click();
		
		Thread.sleep(2000);
		WebElement loc = driver.findElement(By.xpath("//a[text()='Locations']"));
		loc.click();
		Thread.sleep(3000);
		WebElement tablehead = driver.findElement(By.xpath("//div[@class='oxd-table-body']"));
		
		/*List<WebElement> rows = tablehead.findElements(By.xpath("/div[@class='oxd-table-body']/div"));
		outer:
			for(int i=1;i<rows.size();i++)
			{
			String text = "//div[@class='oxd-table-body']/div[index]/div/div";
				String s=Integer.toString(i);
				String result = text.replaceAll("index", s);
			List<WebElement> columns=rows.get(i).findElements(By.xpath(result));
			for(int j=0;j<columns.size();j++)
			{
				
			String value=columns.get(j).getText();
			if(value.equals("banglore"))
			{
				/*System.out.println(columns.get(4).getText());
	         columns.get(0).click();
	         Thread.sleep(3000);
			
			break outer;
				
				System.out.println(columns.get(4).getText());
				columns.get(0).click();
				Thread.sleep(3000);
				         columns.get(6).click();
				         Thread.sleep(3000);
				         WebElement loc1 = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
				         loc1.clear();
				         loc1.sendKeys("San Francisco");
				         Thread.sleep(3000);
				         driver.findElement(By.xpath("//button[text()=' Save ']")).click();
				break outer;

			}

			}

		
		
		
			}*/
		WebElement table=driver.findElement(By.xpath("//div[@class='oxd-table-body']"));
		List<WebElement> rows=table.findElements(By.xpath("//div[@class='oxd-table-body']/div"));
		outer:
		for(int i=1;i<rows.size();i++)
		{
		String text = "//div[@class='oxd-table-body']/div[index]/div/div";
		String s=Integer.toString(i);
		String result = text.replaceAll("index", s);
		List<WebElement> columns=rows.get(i).findElements(By.xpath(result));
		for(int j=0;j<columns.size();j++)
		{
		String value=columns.get(j).getText();
		if(value.equals("California"))
		{
		System.out.println(columns.get(4).getText());
		columns.get(0).click();
		Thread.sleep(3000);
		         columns.get(3).click();
		         Thread.sleep(3000);
		         WebElement loc1 = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
		         loc1.clear();
		         loc1.sendKeys("San Francisco");
		         Thread.sleep(3000);
		         driver.findElement(By.xpath("//button[@type='submit']")).click();
		break outer;


		
		}
		}
		}
		

	}

}
