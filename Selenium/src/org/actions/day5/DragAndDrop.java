package org.actions.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		//Mouse hover Action
		WebElement s = driver.findElement(By.id("credit2"));
		WebElement d = driver.findElement(By.id("bank"));
		
		WebElement src = driver.findElement(By.id("fourth"));
		WebElement dest = driver.findElement(By.id("amt7"));
		
		Actions Act = new Actions(driver);
		Act.dragAndDrop(s, d).perform();
		
		Actions acc = new Actions(driver);
		acc.dragAndDrop(src, dest).perform();
		 

		
		//to maximize the brower
		driver.manage().window().maximize();
		
		
		

	}

}
