
 
package AutomationTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPract {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://demoqa.com/automation-practice-form/");
		driver.get("https://demo.guru99.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions a =new Actions(driver);
		WebElement drpdwn = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		WebElement dp1 = driver.findElement(By.xpath("//a[text()='Flash Movie Demo']"));	
		a.moveToElement(drpdwn).click().moveToElement(dp1).click().build().perform();
		
		
	}
}