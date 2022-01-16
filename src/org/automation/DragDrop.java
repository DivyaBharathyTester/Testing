package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Actions a = new Actions (driver);
		
		WebElement dsource = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dtarget = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		//Thread.sleep(2000);
		
		a.dragAndDrop(dsource, dtarget).build().perform();
		
		WebElement dsource1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement dtarget1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		//Thread.sleep(2000);
		
		a.dragAndDrop(dsource1, dtarget1).build().perform();
		
		WebElement csource = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement ctarget = driver.findElement(By.xpath("(//ol[@align='center'])[3]"));
		
		a.dragAndDrop(csource, ctarget).build().perform();
		
		WebElement csource1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement ctarget1 = driver.findElement(By.xpath("//li[@class='placeholder']"));
		
		a.dragAndDrop(csource1, ctarget1).build().perform();
		
		Thread.sleep(2000);
		
		WebElement perfect = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		a.click(perfect).build().perform();	

	}

}
