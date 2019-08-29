package org.actions.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettyImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gettyimages.in");
		WebElement mousehover = driver.findElement(By.className("text-link--sly action--with-emphasis"));
		mousehover.click();
		/*WebElement mover = driver.findElement(By.className("_1KCOnI _3ZgIXy"));
		mover.click();
*/
	}

}
