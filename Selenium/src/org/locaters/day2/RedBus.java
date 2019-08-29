package org.locaters.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.redbus.in"); 
		
		//find the locater for User Name
		WebElement txtemail = driver.findElement(By.id("src"));
		txtemail.sendKeys("Kmubakonam");
		
		//find the locator for password
		WebElement txtpswd = driver.findElement(By.id("dest"));
		txtpswd.sendKeys("Chennai");
		driver.quit();


	}

}
