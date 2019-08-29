package org.locaters.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.google.com"); 
		
		//find the locater for User Name
		WebElement txtbox = driver.findElement(By.name("q"));
		txtbox.sendKeys("GreensTechnology");
		driver.quit();

	}

}
