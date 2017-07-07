package com.selenium.training.session1;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Project5 {

	public static String chromeDriverPath = "D:/Eclipse Workspace/Selenium Drivers/chromedriver.exe";
	public static WebDriver driver;

	public static void main(String []args) {
		try
		{
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
			driver.get("http://google.com");
			Thread.sleep(2000);
			WebElement searchTextBox=driver.findElement(By.id("lst-ib"));
			searchTextBox.sendKeys("ascendum");
			Thread.sleep(3000);
			WebElement ascendumWebsiteLink=driver.findElement(By.partialLinkText("Rise Together"));
			ascendumWebsiteLink.click();
			Thread.sleep(2000);
			WebElement searchBox=driver.findElement(By.name("s"));
			searchBox.sendKeys("Retail");
			WebElement searchButton = driver.findElement(By.className("search-button"));
			searchButton.click();
			Thread.sleep(2000);
			WebElement healthcareLink = driver.findElement(By.linkText("Retail"));
			healthcareLink.click();
			Thread.sleep(3000);
			String url = driver.getCurrentUrl();
			String title = driver.getTitle();
			driver.quit();
			System.out.println("Last URL: "+ url);
			System.out.println("Last Title: "+ title);
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}