package org.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.guru99.com/test/delete_customer.php");
		//driver.manage().window().maximize();
		
		//WebElement CusId = driver.findElement(By.xpath("//input[@type='text']"));
		//CusId.sendKeys("12345");
				
		//WebElement Submit = driver.findElement(By.name("submit"));
		//Submit.click();
		
		//Alert alert = driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.dismiss();
		//Submit.click();
		//alert.accept();
		
		//Alert alert1 = driver.switchTo().alert();
		//System.out.println(alert1.getText());
		//alert1.accept();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement prompt = driver.findElement(By.xpath("//button[@id='promtButton']"));
		prompt.click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Divya");
		alert2.accept();
		
		
		
		

		

		
		
		

		
	}

}
