package org.actions.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		WebElement mousehover = driver.findElement(By.className("_3GtRpC"));
		Actions act = new Actions(driver);
		act.moveToElement(mousehover).perform();
		WebElement mover = driver.findElement(By.className("_1KCOnI _3ZgIXy"));
		mover.click();
		
		

	}

}
