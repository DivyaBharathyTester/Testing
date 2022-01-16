package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//to launch driver
		
		driver.get("https://www.facebook.com/");
		
		//to get title of the site
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get url of the site
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//to maximise
		
		driver.manage().window().maximize();
		
		//to close/quit
		
		//driver.close();
		//driver.quit();
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Divya Bharathy");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345");
		
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		String login = button.getText();
		System.out.println(login);
		String attributename = button.getAttribute("name");
		System.out.println(attributename);
		button.click();
		
		Thread.sleep(3000);
				
		WebElement errormessage = driver.findElement(By.xpath("(//a[text()='Forgotten password?'])[1]"));
		errormessage.isDisplayed();
		
		String error = errormessage.getText();
		System.out.println(error);
		
		String attributevalue = errormessage.getAttribute("href");
		System.out.println(attributevalue);
		
	}
		
	}


