package org.project.airlines;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AeroFlot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		//......to launch browser.........
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Day1\\MavenStart\\drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aeroflot.ru//xx-en");
		//driver.manage().window().maximize();
		//Thread.sleep(3000);
		//getelement(By.xpath("//button[text()='Yes']"), driver).click();
		//driver.findElement(By.xpath("//button[text()='Yes']")).click();
		driver.findElement(By.id("acceptCookiesLaw")).click();
	
		//...	for from button........	
		/*WebElement popup = driver.findElement(By.xpath("(//button[@type='button'])[2])"));
		popup.click();*/
		WebElement srcbtn= driver.findElement(By.id("city-departure-0-booking"));
		Actions action = new Actions(driver);
		action.doubleClick(srcbtn).perform();
		//srcbtn.clear();
		srcbtn.sendKeys("Dublin");
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);	
		
		/*........ for destination button ....*/
		WebElement destbtn= driver.findElement(By.id("city-arrival-0-booking"));
		/*Actions act = new Actions(driver);
		act.doubleClick(destbtn).perform();*/
		destbtn.clear();
		destbtn.sendKeys("Rome");
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);	
		
		// for travel Date 
		
		WebElement date = driver.findElement(By.id("date-from-booking"));
		date.sendKeys("10/09/19");
		//date.click();
		driver.findElement(By.id("class-service-booking")).click();
		driver.findElement(By.xpath("(//button[@aria-label='Add a passenger'])[1]")).click();
		
		
		// close button
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		//search
		// getelement(By.xpath("(//button[text()='Search'])"),  driver).click();
		 
		driver.findElement(By.xpath("(//button[text()='Search'])")).click();
		//select flight
		Thread.sleep(4000);
		 getelement(By.xpath("(//button[text()='Select Flight'])[2]"),  driver).click();
		//driver.findElement(By.xpath("(//button[text()='Select Flight'])[2]")).click();
		//book the flight
		driver.findElement(By.xpath("(//button[text()='Book'])[2]")).click();
		//Expand the fare details
		driver.findElement(By.xpath("//div[text()='Expand']")).click();
		//Enter Passengers
		driver.findElement(By.xpath("//div[@class ='next__button-inner']")).click();
		//Enter the passenger details
		driver.findElement(By.xpath("(//a[@role='button'])[4]")).click();
		
		driver.findElement(By.xpath("(//input[@title='Surname'])[1]")).sendKeys("Krithika");
		driver.findElement(By.xpath("(//input[@title='Name'])[1]")).sendKeys("Anu");
		WebElement suffix = driver.findElement(By.xpath("(//select[@class='input__select-input'])[2]"));
		Select sel = new Select(suffix);
		sel.selectByVisibleText("Sr");
		//driver.findElement(By.className("icon input__icon input__icon--right icon--calendar")).click();

	}
	
	static WebElement getelement(By by, WebDriver driver) {
		while(true) {
			try {
				WebElement element =driver.findElement(by);
				return element;
			}catch(NoSuchElementException ex) {
				
			}
		
		}
		
	}

}
