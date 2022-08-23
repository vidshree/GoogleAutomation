package AutomationTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutmTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	/*WebElement Fname = driver.findElement(By.id("firstName"));
		Fname.sendKeys("Vidya");
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("Shree");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("abc@gmail.com");
		WebElement radio1 = driver.findElement(By.id("gender-radio-2"));
		radio1.click();
		WebElement mobile = driver.findElement(By.id("userNumber"));
		mobile.sendKeys("9712806314");
		WebElement subject = driver.findElement(By.id("subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3"));
		subject.sendKeys("Automation testing tool. Jira...");
		WebElement address= driver.findElement(By.id("currentAddress"));
		address.sendKeys("#123, Sw Wascoe Street, Northplains");*/
		
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));
		fname.sendKeys("vidya");
		WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lname.sendKeys("shree");
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("mounaren718@gmail.com");
		WebElement Gender = driver.findElement(By.xpath("//label[text()='Female']"));
		Gender.click();
		WebElement phno = driver.findElement(By.xpath("//input[@id='userNumber']"));
		phno.sendKeys("123456789");
		//driver.findElementByClassName(By.xpath("))
	//    WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	   
		//dob.sendKeys("1 March 1986");
		WebElement hobby = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
		hobby.click();
		
		
		
		
		
	}

}


