package org.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to lanch site
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
			
		
		//To get titledfxca vvv 
		String title = driver.getTitle();
		System.out.println("Title for Site :"+title);
		// to get current url	
		String url = driver.getCurrentUrl();
		System.out.println("current URL is :"+url);
		driver.quit();
				
				

	}

}
