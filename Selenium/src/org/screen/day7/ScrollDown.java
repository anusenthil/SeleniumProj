package org.screen.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://toolsqa.com/");
		WebElement src = driver.findElement(By.xpath("//div[@class='bottom-text-block']"));
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		jk.executeScript("arguments[0].scrollIntoView(true);", src);
	
		System.out.println((src.getText()));
	}

}
