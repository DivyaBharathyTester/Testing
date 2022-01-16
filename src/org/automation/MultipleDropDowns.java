package org.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDowns {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		WebElement Fruits = driver.findElement(By.id("fruits"));
		Select s = new Select(Fruits);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		s.selectByIndex(0);
		s.selectByValue("apple");
		s.selectByVisibleText("Orange");
		
		Thread.sleep(500);
		
		List<WebElement> Options = s.getOptions();
		for (WebElement x : Options) {
			System.out.println("Available options are"+x.getText());
			
		}
		
		WebElement FirstSelectedOption = s.getFirstSelectedOption();
		System.out.println("First selected option is"+FirstSelectedOption.getText());
		
		List<WebElement> AllSelectedOptions = s.getAllSelectedOptions();
		for (WebElement x : AllSelectedOptions) {
			System.out.println("All Selected Options are"+x.getText());
			
		}
		
		//s.deselectAll();
		
		Thread.sleep(500);
		
		s.deselectByIndex(0);
		Thread.sleep(500);
		
		s.deselectByValue("apple");
		Thread.sleep(500);
		
		s.deselectByVisibleText("Orange");
		Thread.sleep(500);
		
}		

}
