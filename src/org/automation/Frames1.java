package org.automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://demo.guru99.com/test/guru99home");
	
	//refresh
	
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	WebElement image = driver.findElement(By.xpath("//h3[contains(text(),'iFrame')]"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)",image);
	String text = image.getText();
	System.out.println(text);

	//switch to frame
	
	//driver.switchTo().frame(1);
	//WebElement image2 = driver.findElement(By.xpath("//img[contains(@src,'Jmeter720.png')]"));
	//image2.click();
	
	
	//driver.switchTo().parentFrame();
	//WebElement email = driver.findElement(By.xpath("//input[@id='philadelphia-field-email']"));
	//email.sendKeys("divyabaharathy@123");		
	
	//To find number of frames or whether frame is available or not //dynamic frames
	
	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	System.out.println(frames.size());
	for (int i = 0; i < frames.size(); i++) {
		driver.switchTo().frame(i);
		Thread.sleep(2000);
		try {
			WebElement image3 = driver.findElement(By.xpath("//img[contains(@src,'Jmeter720.png')]"));
			image3.isDisplayed();
			image3.click();
			Thread.sleep(2000);
			break;
			
		} catch (Exception e) {
			System.out.println("No such frame is available");
		
		}
		
	}

	

}
}