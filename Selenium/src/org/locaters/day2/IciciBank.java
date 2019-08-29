package org.locaters.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement txtUser = driver.findElement(By.className("login-input type_UserPrincipal"));
		txtUser.sendKeys("Anu");
		WebElement txtpass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		txtpass.sendKeys("shravan");
		driver.quit();
		

	}

}
