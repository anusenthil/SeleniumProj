package org.locaters.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/login");
		WebElement txtuser = driver.findElement(By.name("session[username_or_email]"));
		txtuser.sendKeys("Anu");
		WebElement txtpass = driver.findElement(By.name("session[password]"));
		txtpass.sendKeys("Hello");
		driver.quit();

	}

}
