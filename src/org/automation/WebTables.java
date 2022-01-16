package org.automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));	
		for (int i = 0; i < tRows.size(); i++) {
			List<WebElement> tDatas = tRows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < tDatas.size(); j++) {
				String value = tDatas.get(j).getText();
				System.out.println(value);
			if (value.contains("Corporation Bank")) {
				String cb = tDatas.get(3).getText();
				System.out.println("CB"+cb);
			}
				else if (value.contains("HDIL")){
					String HDIL = tDatas.get(3).getText();
					System.out.println("HDIL"+HDIL);
				}
					
				}
				
		}}}		
			
				

