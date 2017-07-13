package com.selenium.training.session2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project2 {

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

			List <WebElement> industriesSubLinks=driver.findElements(By.xpath("//li[a='INDUSTRIES']/ul/li/a"));
			System.out.println("Industries Sub Links: ");
			for(WebElement we1 : industriesSubLinks)
			{
				System.out.println(we1.getAttribute("href"));
			}

			List <WebElement> industriesSubCategories=driver.findElements(By.xpath("//li[a='INDUSTRIES']/ul/li"));
			System.out.println("Industries Sub Links from Categories: ");
			for(WebElement we1 : industriesSubCategories)
			{
				List <WebElement> industriesSubLinks2=we1.findElements(By.tagName("a"));

				for(WebElement we2: industriesSubLinks2)
				{

					System.out.println(we2.getAttribute("href"));
				}
			}

			driver.quit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}