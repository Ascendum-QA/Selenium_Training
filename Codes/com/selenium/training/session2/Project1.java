package com.selenium.training.session2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1 {

	public static String driverPath = "D:/Eclipse Workspace/Selenium Drivers/chromedriver.exe";
	public static WebDriver driver;

	public static void main(String []args) {
		try
		{
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.ascendum.com");
			Thread.sleep(2000);

			List <WebElement> unsortedLists= driver.findElements(By.tagName("h5"));
			System.out.println("H5 Headers: ");
			for(WebElement we : unsortedLists)
			{
				System.out.println(we.getText());
			}

			driver.quit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}