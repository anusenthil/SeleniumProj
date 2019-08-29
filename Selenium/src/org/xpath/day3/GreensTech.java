package org.xpath.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement path = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		path.click();
		
		WebElement name = driver.findElement(By.id("InputName"));
		name.sendKeys("Anu");
		
		WebElement email =driver.findElement(By.id("InputEmail1"));
		email.sendKeys("anu22@gmail.com");
		
		WebElement mno = driver.findElement(By.id("InputSubject"));
		mno.sendKeys("1234546");
		
		WebElement course = driver.findElement(By.name("courses"));
		course.sendKeys("Java");
		

	}

}
