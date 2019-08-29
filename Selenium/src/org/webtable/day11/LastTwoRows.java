package org.webtable.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastTwoRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Day1\\SeleniumStart\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		List<WebElement> first_row = driver.findElements(By.tagName("tr"));
		
		WebElement lastrow = first_row.get(first_row.size()-1);
		List<WebElement> first_data = lastrow.findElements(By.tagName("td"));
		
		WebElement row = first_row.get(first_row.size()-2);
		List<WebElement> lastdata = row.findElements(By.tagName("td"));
		
		for (WebElement data : first_data) {
			String name = data.getText();
			System.out.println(name);
		}
			for (WebElement data1 : lastdata) {
				String name1=data1.getText();
			System.out.println(name1);
				}
			/*for (int i =1; i <=Istrow.size()-2; i++) {
				WebElement row = Istrow.get(i);

				List<WebElement> fdata = row.findElements(By.tagName("td"));
				for (WebElement getdata : fdata) {
					String name = getdata.getText();
					System.out.println(name);

				}
			}*/
			
	  driver.quit();


	}

}
