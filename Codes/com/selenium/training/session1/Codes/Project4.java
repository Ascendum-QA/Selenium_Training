package com.selenium.training.session1;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Project4 {

	public static String chromeDriverPath = "D:/Eclipse Workspace/Selenium Drivers/chromedriver.exe";
	public static WebDriver driver;

	public static void main(String []args) {
		try
		{
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
			driver.get("http://google.com");
			Thread.sleep(5000);
			System.out.println("Title: " + driver.getTitle());
			driver.navigate().to("http://ascendum.com");
			Thread.sleep(5000);
			System.out.println("Title: " + driver.getTitle());
			driver.navigate().back();
			Thread.sleep(3000);
			System.out.println("Current URL: " + driver.getCurrentUrl());
			driver.navigate().forward();
			Thread.sleep(5000);
			System.out.println("Current URL: " + driver.getCurrentUrl());
			driver.navigate().refresh();
			Thread.sleep(5000);
			System.out.println("Title: " + driver.getTitle());
			System.out.println("Current URL: " + driver.getCurrentUrl());
			URL url = new URL("http://voraventures.com/");
			driver.navigate().to(url);
			Thread.sleep(3000);
			System.out.println("Title: " + driver.getTitle());
			System.out.println("Current URL: " + driver.getCurrentUrl());
			
			driver.quit();
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}