package com.selenium.training.session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Project3 {

	public static String chromeDriverPath = "D:/Eclipse Workspace/Selenium Drivers/chromedriver.exe";
	public static WebDriver driver;

	public static void main(String []args) {
		try
		{
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
			driver.get("http://google.com");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			System.out.println("Page Title: " +driver.getTitle());
			System.out.println("Current URL: " + driver.getCurrentUrl());
			if(driver.getCurrentUrl().equals("https://www.google.co.in/?gfe_rd=cr&ei=hIhbWYXiAcuL8QeM57T4AQ&gws_rd=ssl"))
			{
				System.out.println("URL Matched");
			}
			else
			{
				System.out.println("URL Mismatch");
			}
			//System.out.println("Page Source: " + driver.getPageSource());
			
			
			driver.quit();
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}