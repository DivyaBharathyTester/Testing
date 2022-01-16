package org.automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class WindowsHandling {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		//search.sendKeys("Hair Straightener",Keys.ENTER);
		//Thread.sleep(2000);
		
		//WebElement product = driver.findElement(By.xpath("//span[contains(text(),'Philips ')][1]"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView(true)", product);
		//Thread.sleep(2000);
		//product.click();
		
		String parentUrl = driver.getWindowHandle();
		
		Set<String> WindowHandles = driver.getWindowHandles();
		for (String childurl : WindowHandles) {
			if (!parentUrl.equals(childurl)) {
				driver.switchTo().window(childurl);
			}
						
        //WebElement atc = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
        //atc.click();        
        //driver.switchTo().window(parentUrl);
			
		}
}
}