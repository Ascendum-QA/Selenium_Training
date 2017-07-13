package com.selenium.training.session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Project2 {

	public static String chromeDriverPath = "D:/Eclipse Workspace/Selenium Drivers/chromedriver.exe";
	public static String ieDriverPath = "D:/Eclipse Workspace/Selenium Drivers/IEDriverServer.exe";
	public static String firefoxDriverPath = "D:/Eclipse Workspace/Selenium Drivers/geckodriver.exe";
	public static WebDriver driver;

	public static void main(String []args) {
		try
		{
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
			driver.get("http://google.com");
			Thread.sleep(5000);
			driver.quit();
			
			System.setProperty("webdriver.ie.driver", ieDriverPath);
			driver = new InternetExplorerDriver();
			driver.navigate().to("http://google.com");
			Thread.sleep(5000);
			driver.quit();
			//https://github.com/SeleniumHQ/selenium/wiki/InternetExplorerDriver#required-configuration
			//http://toolsqa.com/selenium-webdriver/challenges-to-run-selenium-scripts-with-ie-browser/
			
			System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
			driver = new FirefoxDriver();
			driver.get("http://google.com");
			Thread.sleep(5000);
			driver.quit();
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}