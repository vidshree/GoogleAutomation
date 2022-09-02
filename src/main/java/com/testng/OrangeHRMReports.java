package com.testng;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OrangeHRMReports {
	public static ChromeDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	public static  int i;

	
	
	
@BeforeSuite
	public void begin()
	{                                                                                  
		report=new ExtentReports(".//reports//OrangeHRMReport.html",true);
		report.addSystemInfo("environment", "QA");
		report.addSystemInfo("userstory1", "sprint1");
		report.addSystemInfo("Author", "Vidya");
		test=report.startTest("User is able to login the Orange HRM website");
	}
	

@Test
	public void orangeHRMLogin() throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	test.log(LogStatus.PASS,"Opened Website"+ test.addScreenCapture(snap()));
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	test.log(LogStatus.PASS, "Entered Username"+ test.addScreenCapture(snap()));
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	test.log(LogStatus.PASS, "Entered Password"+ test.addScreenCapture(snap()));
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	test.log(LogStatus.PASS, "USer is able to see home page"+ test.addScreenCapture(snap()));
	
	
	}
	
	@AfterSuite
	public void finish()
	{
		report.endTest(test);
		report.flush();
	}
	
	
	public String snap() throws IOException
	{
		

		Random r=new Random();
		String dummy ="";
		if(r.nextInt()!=0)
		{
			i=i+1;
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File(".//pics//img " +i+ ".png");
			FileUtils.copyFile(src,dest);
			dummy=dest.getAbsolutePath();
			
		}
		return dummy;
	}
	
}
