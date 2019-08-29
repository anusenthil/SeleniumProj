package org.actions.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PrintPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement sft = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions act = new Actions(driver);
		act.moveToElement(sft).perform();
		WebElement strain = driver.findElement(By.xpath("//span[text()='Software Testing Training ']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(strain).perform();
		WebElement sele = driver.findElement(By.xpath("//span[text()='Selenium Training']"));
		sele.click();
		//WebElement para = driver.findElement(By.xpath(""))
		
		
		

	}

}
