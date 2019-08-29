package org.actions.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		
		// mouse over action
		
		WebElement btnshop = driver.findElement(By.id("nav-link-shopall"));
		 WebElement btnsub = driver.findElement(By.className("nav-text"));
		 Actions acc= new Actions(driver);
		 Actions acc1= new Actions(driver);
		 
		 acc.moveToElement(btnshop).perform();
		 acc1.moveToElement(btnsub).perform();
		 
		 // to click the button event
		  WebElement btnPower = driver.findElement(By.className("nav-text"));
		  btnPower.click();
		  
		  driver.quit();
		 
		
		
		

	}

}
