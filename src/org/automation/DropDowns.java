package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();
		
		Thread.sleep(2000);
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select s = new Select(Day);
		s.selectByIndex(21);
		Boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(Month);
		s1.selectByValue("12");
		
		WebElement Year = driver.findElement(By.name("birthday_year"));
		Select s2 = new Select(Year);
		s2.selectByVisibleText("1995");
	
}
}