package org.xpath.day3;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement path = driver.findElement(By.xpath("//input[@type='email']"));
		path.sendKeys("anu");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("hello");
		WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
		login.click();
		try {
		WebElement successData = driver.findElement(By.xpath("//span[text()='Anu']"));
		System.out.println("Successfully Login"+successData);
		
		}catch (NoSuchElementException e) {
			System.out.println("Invalid login");
		}

	}

}
