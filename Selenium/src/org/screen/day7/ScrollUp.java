package org.screen.day7;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com");
		driver.manage().window().maximize();
		JavascriptExecutor jsexcecute = (JavascriptExecutor)driver;
		jsexcecute.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		jsexcecute.executeScript("window.scrollTo(0,-document.body.scrollHeight)");


	}

}
