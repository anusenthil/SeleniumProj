package org.locaters.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com"); 
		
		//find the locater for User Name
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("Anu");
		
		//find the locator for password
		WebElement txtpswd = driver.findElement(By.id("pass"));
		txtpswd.sendKeys("Shravan");
		
		Thread.sleep(2000);
		driver.quit();

	}

}
